package recursion.sort;

import java.util.Arrays;

public class mergeSort {
//    static int[] temp=new int[100];

    static void MergeSort(int[] arr,int[] temp,int low,int high){
        if(low<high){
            int mid=low+(high-low)/2;
            MergeSort(arr,temp,low,mid);
            MergeSort(arr,temp,mid+1,high);
            Merge(arr,temp,low,mid,high);
        }
    }

    static void Merge(int[] arr,int[] temp,int low,int mid,int high){
        int i=low,j=mid+1,k=low;
        while((i<=mid) && (j<=high)){
            if(arr[i]<arr[j]){
                temp[k]=arr[i];
                k++;
                i++;
            }
            else{
                temp[k]=arr[j];
                k++;
                j++;
            }
        }
        while(i<=mid){
            temp[k]=arr[i];
            k++;
            i++;
        }
        while(j<=high){
            temp[k]=arr[j];
            k++;
            j++;
        }
        for(i=low;i<=high;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        int[] temp = new int[array.length];
        MergeSort(array,temp,0,array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
