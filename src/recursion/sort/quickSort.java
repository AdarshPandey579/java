package recursion.sort;

import java.util.Arrays;

public class quickSort {

    static void Quick(int[] arr, int low, int high){
        if(low<high){
            int j=pivotPos(arr,low,high);
            Quick(arr,low,j-1);
            Quick(arr,j+1,high);
        }
    }

    static int pivotPos(int[] arr,int low , int high){
        int i=low+1,j=high,pivot=arr[low];
        while(true){
            while((i<high) && (arr[i]<=pivot)){
                i++;
            }
            while ((j > low) && (arr[j]>pivot)) {
                j--;
            }
            if(i<j){
                swap(arr,i,j);
            }
            else {
                swap(arr,j,low);
                break;
            }
        }
        return j;
    }

    static void swap(int[] arr,int i, int j) {
        int t=arr[i];
       arr[i]=arr[j];
        arr[j]=t;
    }

    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
//        int[] arr={10,7,8,9,1,5};

        Quick(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
