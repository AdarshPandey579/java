package ANONUMOUS;

interface c1{ // not required functional interface.
    void fun1();
    int fun2(int i);
}

class c2{
    void fun1(){
        System.out.println("class fun1");
    }
    int fun2(int i){
        return i*2;
    }
}

abstract class c3{
    abstract void fun1();
    int  fun2(int i){
        return i*4;
    }
}

public class CLASS {
    public static void main(String[] args) {
        System.out.println("INTERFACE");
        c1 a = new c1() {
            @Override
            public void fun1() {
                System.out.println("hello");
            }

            @Override
            public int fun2(int i) {
                return i*2;
            }
        };
        a.fun1();
        System.out.println("this is "+a.fun2(10));

        System.out.println("\nCLASS");
        c2 b = new c2(){
            @Override
            void fun1() {
                System.out.println("hello main function");
            }

            @Override
            int fun2(int i) {
                return i*3;
            }
        };
        b.fun1();
        System.out.println("this is "+b.fun2(10));

        System.out.println("\nABSTRACT CLASS");
        c3 c = new c3() {
            @Override
            void fun1() {
                System.out.println("hello abstract");
            }

            @Override
            int fun2(int i) {
                return super.fun2(i);  // fun2 method get inherited using super keyword
            }
        };
        c.fun1();
        System.out.println("this is "+c.fun2(10));
    }
}
