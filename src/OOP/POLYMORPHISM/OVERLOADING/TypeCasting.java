package OOP.POLYMORPHISM.OVERLOADING;

class demo{
    void test(){
        System.out.println("no parameter.");
    }

    void test(double a){
        System.out.println(a);
    }

    void test(double a,double b){
        System.out.print(a+"\t");
        System.out.println(b);
    }
}

public class TypeCasting {

//    static void MAIN(){
//        demo a = new demo();
//        a.test();
//        a.test(4);
//        a.test(3,5.6);
//
//    }

    void MAIN(){
        demo a = new demo();
        a.test();
        a.test(4);
        a.test(3,5.6);

    }

    public static void main(String[] args) {
//        MAIN(); // static don't required object to run.

        TypeCasting a = new TypeCasting();  // non-static required object to run
                                            // either outside class or within th class.
        a.MAIN();
    }
}
