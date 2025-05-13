package recursion.pattern;

public class pattern1 {

    static void p1(int i , int j){
        if(i==0){
            return;
        }

//        if(j!=0){
//            System.out.print("* ");
//            p1(i,j-1);
//        }
//        else{
//            System.out.println();
//            p1(i-1,j=i-1);
//        }

        if(i>j){
            System.out.print("* ");
            p1(i,j+1);
        }
        else{
            System.out.println();
            p1(i-1,0);
        }
    }

    public static void main(String[] args) {
//        p1(4,4)  // for 1st method
        p1(4,0);
    }
}
