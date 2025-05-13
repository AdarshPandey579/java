package sort.CYCLIC;

public class missingNum2 {

    // by searching .
    // range [0,N]


    static void swap(int[] array , int a, int b){
        int t=array[a];
        array[a]=array[b];
        array[b]=t;
    }

    static int missing(int[] array){
        int i=0;
        while(i<array.length){
            int cIndex=array[i];
            if(i!=cIndex && cIndex<array.length){      // cIndex hold value at i so it is less than array .length
                swap(array,cIndex,i);
            }
            i++;

//            if(i!=cIndex && cIndex<array.length && cIndex!=i-1){
//                swap(array,cIndex,i);
//            }else{
//                i++;
//            }
        }

        for(i=0;i<array.length;i++){
            if(array[i]!=i){
                return i;
            }
        }
        return array.length;
    }

    public static void main(String[] args) {
//        int[] array={0,1,2,4,6,8,3,4,9,7};
        int[] array={1,1};     // 0 is first missing element
//        int[] array={0,1,1};   // 2 is first missing element
        System.out.println(missing(array));
    }
}
