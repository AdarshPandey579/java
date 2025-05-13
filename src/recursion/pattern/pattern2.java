package recursion.pattern;

public class pattern2 {

    static void p2(int i, int j){
        if(i==0){
            return;
        }

//        if(j!=0){
//            p2(i,j-1);
//            System.out.print("* ");
//        }
//        else{
//            p2(i-1,i-1);
//            System.out.println();
//        }

        if(j<i){
            p2(i,j+1);
            System.out.print("* ");
        }
        else {
            p2(i-1,0);
            System.out.println();
        }
    }

    public static void main(String[] args) {
//        p2(4,4);  // for 1st method
        p2(4,0);

    }
}
