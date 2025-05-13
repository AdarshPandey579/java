package recursion.sort;

import java.util.Arrays;

public class bubbleSort {

    static void Bubble(int[] arr, int i , int j){
        if(i==0){
            return;
        }
        if(j<i){
            if(arr[j]>arr[j+1]){
                int t=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=t;
            }
            Bubble(arr,i,j+1);
        }
        else
            Bubble(arr, i - 1, 0);
    }

    public static void main(String[] args) {
        int[] array={5,4,3,2,1};
        Bubble(array, array.length-1,0);
        System.out.println(Arrays.toString(array));
    }
}
