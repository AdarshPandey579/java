package sort.CYCLIC;

public class missingNum1 {

    static void swap(int[] array, int a, int b) {
        int t = array[a];
        array[a] = array[b];
        array[b] = t;
    }

    static int missing(int[] array) {

//        for range[0,N]
//        without using search

        int mis = array.length, i = 0;
        while (i < array.length) {
            int cIndex = array[i];
            if (array[i] == array.length) {
                mis = i;                      // mis element index = index of N
                i++;
            } else if (i == cIndex) {
                i++;
            } else {
                swap(array, i, cIndex);     // put value array[i] at index=cIndex i.e. put 1 at index=1.
            }
        }

        return mis;
    }

    public static void main(String[] args) {
//        int[] array ={0,1,2,3,4,5,6,7,9};     // 8 is missing
//        int[] array ={4,0,2,1};               // 3 is missing
        int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8};     // nothing is missing
//        int[] array ={0,4,2,1};                 // 3 is missing

        System.out.println(missing(array));
    }
}
