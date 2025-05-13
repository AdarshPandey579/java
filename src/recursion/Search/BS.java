package recursion.Search;

public class BS {

    static int bs(int[] arr,int s,int e,int target) {  // Binary search
        if (s > e) {
            return -1;
        }
        int m = s + (e - s) / 2;
        if (arr[m] == target) {
            return m;
        } else if (arr[m] < target) {
            return bs(arr, m + 1, e, target);
        } else{
            return bs(arr, s, m - 1, target);
        }

    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,10};
        int target=8;
        System.out.println(bs(arr,0,arr.length-1,target));
    }
}
