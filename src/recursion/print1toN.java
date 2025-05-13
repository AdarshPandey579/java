package recursion;

public class print1toN {


    // for 1 to N
//    static void num(int n){
//        if (n==0){
//            return;
//        }else{
//            num(n-1);
//            System.out.print(n+" ");
//        }
//    }

    // for N to 1
//    static void revnum(int n){
//        if (n==0){
//            return;
//        }else{
//            System.out.print(n+" ");
//            revnum(n-1);
//        }
//    }

    static void num(int n){
        if (n==0){
            System.out.println(); // before reaching there it print N to 1
        }else{
            System.out.print(n+" ");
            num(n-1);
            System.out.print(n+" "); //this print 1 to N during coming out from stack
        }
    }

    public static void main(String[] args) {
        num(5);
    }
}
