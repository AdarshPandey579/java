package OOP.POLYMORPHISM;

class A{
    void f1(){
        System.out.println("A1");
    }
    void f2(){
        System.out.println("A2");
    }
}

class B extends A{
    void f2(){
        System.out.println("B2");
    }
    void f3(){
        System.out.println("B3");
    }
}

public class funcOverriding {
    public static void main(String[] args) {
//        OOP.POLYMORPHISM.A a = new OOP.POLYMORPHISM.A();
//        a.f1();
//        a.f2();

//        OOP.POLYMORPHISM.A a = new OOP.POLYMORPHISM.B();
//        a.f1();
//        a.f2();

        B a = new B();
        a.f1();
        a.f2();
        a.f3();
    }
}
