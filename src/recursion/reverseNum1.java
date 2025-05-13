package recursion;

public class reverseNum1 {
    static int sum=0;

    static void revNum(int num){
        if(num == 0){
            return;
        }else{
            sum=sum*10 + (num%10);
            revNum(num/10);
        }
    }

    public static void main(String[] args) {
//        System.out.println(sum);
        revNum(12345);
        System.out.println(sum);
    }
}
