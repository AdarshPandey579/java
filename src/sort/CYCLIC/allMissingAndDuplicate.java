package sort.CYCLIC;

import java.util.ArrayList;
import java.util.Arrays;

public class allMissingAndDuplicate {

    // range[0,N]
    // using search method

    static ArrayList<Integer> missing(int[] array){
        int i=0;
        while(i<array.length){
            int cIndex=array[i];
            if(cIndex<array.length &&
                    cIndex!=i &&   // element present at right place
                    array[i]!=array[cIndex]){  // array[i]!=array[cIndex] is condition if 2 already present at index 2
                int t=array[cIndex];
                array[cIndex]=array[i];
                array[i]=t;
                continue;
            }
            i++;
        }
        System.out.println(Arrays.toString(array));

        ArrayList<Integer> missingNum=new ArrayList<>();
        for(i=0;i<array.length;i++){
            if(array[i]!=i){
                missingNum.add(i);       // missingNum.add(array[i]) give duplicate number.
            }
        }

        return missingNum;
    }

    public static void main(String[] args) {
//        int[] array={9,9,9,9,9,9,9,9,9,9};
//        int[] array={0,1,2,4,6,2,2,4,9,7};      // 3,5,8 are missing.   2 appear 3 time.
//        int[] array={0,1,2,4,6,7,9,4,9,7};      // 3,5,8 are missing.  9 appear 2 time
//        int[] array={0,1,2,2,4,4,6};      //  3,5 are missing.
        int[] array={9,8,7,6,5,4,3,2,1,0};


        System.out.println("Missing nums are : "+missing(array));
    }
}
