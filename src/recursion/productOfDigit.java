package recursion;

public class productOfDigit {

    static int digitProduct(int num){
        if(num==0){
            return 1;
        }else{
            return (num%10)*digitProduct(num/10);
        }
    }

    public static void main(String[] args) {
        System.out.println(digitProduct(505));
    }
}
