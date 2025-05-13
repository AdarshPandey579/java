package recursion.Search;


public class LS {

    static boolean ls(int[] array , int target , int i){

//        METHOD 1
//        if(i==array.length){
//            return -1;
//        } else if (array[i]==target) {
//            return i;
//        }else{
//            return ls(array, target,i+1);
//        }

        if (i==array.length-1)  //not for duplicate num
            return false;
        return (array[i]==target) || ls(array,target,i+1);
    }

    static void ls1(int[] array , int target , int i){
        if(i==array.length){
            return;
        }
        if (array[i]==target) {
            System.out.println(i);
        }
        ls1(array,target,i+1);
    }

    public static void main(String[] args) {
        int[] arr={1,8,3,4,5,6,7,8,8,10};
        int target=8;
//        int target=89;
//        System.out.println(ls(arr,target,0));
        ls1(arr,target,0);
    }
}
