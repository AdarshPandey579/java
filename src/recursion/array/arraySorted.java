package recursion.array;

public class arraySorted {
    static boolean check(int[] arr, int i){
        if(i==arr.length-1){   //(i>arr.length-1)
            return true;
        }else if(arr[i]>arr[i+1]){
            return false;
        }else{
            return check(arr,i+1);
        }
    }

    public static void main(String[] args) {
//        int[] arr={1,2,3,4,5,6,4};
//        int[] arr={1,2,3,4,8,5,6};
        int[] arr={1,2,3,4,5,6,7};

        System.out.println(check(arr,0));
    }
}
