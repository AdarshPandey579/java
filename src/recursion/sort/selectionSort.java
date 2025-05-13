package recursion.sort;

import java.util.Arrays;

public class selectionSort {

    static void selection(int[] arr, int i , int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[i]){
                int t=arr[j];
                arr[j]=arr[i];
                arr[i]=t;
            }
            selection(arr,i,j+1);
        }
        else{
            selection(arr,i-1,0);
        }
    }

    public static void main(String[] args) {
//        int[] array={5,4,3,2,1};
        int[] array={1,4,3,5};
        selection(array, array.length-1,0);
        System.out.println(Arrays.toString(array));
    }
}
