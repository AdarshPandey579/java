package recursion;

public class countStep {
    static int c=0;

    static int count_step(int n){
        if(n==0){
            return c;
        }else if(n%2==0){
            c++;
            return count_step(n/2);
        }else{
            c++;
            return count_step(n-1);
        }
    }

    public static void main(String[] args) {
//        System.out.println(count_step(8));
        System.out.println(count_step(123));
//        count_step(8);
    }
}
