package sort;

import java.util.Arrays;
public class insertion {

    static void Insertion(int[] array){
        for(int i=1;i<array.length;i++){
            int key=array[i];
            int j=i-1;
            while(j>=0 && array[j]>key) {
                if (array[j] > key) {
                    array[j + 1] = array[j];
                }
                j--;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] array={5,3,4,1,2};
//        int[] array={5,3,4,1,4,2};
//        int[] array={5,3,4,4,1,2};

        Insertion(array);
        System.out.println(Arrays.toString(array));
    }
}
