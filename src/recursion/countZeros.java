package recursion;

public class countZeros {

    static int c=0;

    static int count0(int n){
        if(n==0) {
            return c;
        } else if (n % 10 == 0) {
            c++;
        }
        count0(n/10);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(count0(780000));
//        System.out.println(count0(03030));  // Octal data type


    }
}
