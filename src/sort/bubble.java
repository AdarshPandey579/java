package sort;

import java.util.Arrays;

;
public class bubble {
    static void Bubble(int[] array){
        for(int i=array.length-1;i>0;i--){              //for(int i=0;i<array.length-1;i++){
            int c=0;                                    //     int c=0;
            for(int j=1;j<=i;j++){                      //     for(int j=1;j<array.length-i;j++){
                if(array[j]<array[j-1]){
                    int t=array[j];
                    array[j]=array[j-1];
                    array[j-1]=t;
                    c++;
                }
            }
            if(c==0){
                System.out.println("hello");     // if array get sorted before last pass so no need to extend the process
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] array={1,5,4,3,2};
//        int[] array={2,3,4,5,1};       // smallest num at last index so all passes run no "hello" print
//        int[] array={1,5,4,3,2};       // hello - array sorted before all passes

        Bubble(array);
        System.out.println(Arrays.toString(array));
    }
}
