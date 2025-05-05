package ambiguity;

import java.util.Arrays;

public class changeArray{

    static void modify(int[] array){
        int t;
        t=array[0];
        array[0]=array[1];
        array[1]=t;
        System.out.println(Arrays.toString((array)));
    }
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
        modify(array);                    // change in array through function
        System.out.println(Arrays.toString((array)));   // main array also get changed
    }
}
