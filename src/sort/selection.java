package sort;

import java.util.Arrays;

public class selection {
    static void Selection(int[] array){

        for(int i=array.length-1;i>0;i--){
            int largestIndex=0;
            for(int j = 1;j<=i; j++){                   // get index of largest element
                if(array[largestIndex]<array[j]){
                    largestIndex=j;
                }
            }

            int t=array[i];                            // after finding largest num index, replace with right index
            array[i]=array[largestIndex];
            array[largestIndex]=t;

        }
    }

    public static void main(String[] args) {
        int[] array={4,5,1,2,3};
        Selection(array);
        System.out.println(Arrays.toString(array));
    }
}