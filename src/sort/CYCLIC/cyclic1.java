package sort.CYCLIC;

import java.util.Arrays;
public class cyclic1 {
    static void swap(int[] array,int a,int b){
        int t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    static void Cyclic(int[] array){
        int i=0;
        while(i<array.length){
            int index=array[i] -1;             // correct index of element at i
            if(index==i){                      // element at correct index then check next element
                i++;
            }else{
                swap(array,index,i);          // swap element to correct index
            }
        }
    }

    public static void main(String[] args) {
//        int[] array={3,5,2,1,4};
//        int[] array={1,2,3,4,5};
        int[] array={5,4,3,2,1};
        Cyclic(array);
        System.out.println(Arrays.toString(array));
    }

}
