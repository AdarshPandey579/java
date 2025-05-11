package NestedClass;

class Outer{
    Inner obj = new Inner();
    int a;
    static class Inner{
        float b;
        void show(){
            System.out.println(b);
        }
    }
}

public class STATIC {
    public static void main(String[] args) {
        Outer obj1 = new Outer();

//    outer.inner obj2 = obj1.new Inner(); // error. Inner class is static
        Outer.Inner obj2 = new Outer.Inner();  // no error. Inner is static no need of object of outer class

        obj2.b=5;
        obj2.show();
    }
}
