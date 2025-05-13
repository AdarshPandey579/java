package sort.CYCLIC;

import java.util.Arrays;

public class cyclic2 {
    // range [1,N]
    public static void main(String[] args) {
        int[] New={4,3,2,1};
        for(int i=0;i<New.length;i++){
            int cIndex=New[i];
            if(cIndex!=i+1){
                int t=New[cIndex-1];
                New[cIndex-1]=cIndex;
                New[i]=t;
            }
        }
        System.out.println(Arrays.toString(New));
    }
}
