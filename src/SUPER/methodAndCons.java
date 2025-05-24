package SUPER;

class C1 {
    C1() {
        System.out.println("hello parent constructor");
    }

    void f() {
        System.out.println("hello parent method");
    }
}

class D1 extends C1{
    D1(){
        super();
        super.f(); //function call in constructor.
    }

    void fun(){
//        super(); //constructor cannot call in method.
        super.f();
    }
}

public class methodAndCons {
    public static void main(String[] args) {
        D1 obj = new D1();
        obj.fun();
    }
}
