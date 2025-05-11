package NestedClass;

class outer1 {
    inner ob = new inner(); // inner class is accessible by creating object.
    int a;
    class inner{
        int b;
        void show(){
            System.out.println(b);
        }
    }
}

public class DEFAULT {
    public static void main(String[] args) {
        outer1 obj1 = new outer1();

        outer1.inner obj2 = obj1.new inner();
//        outer.inner obj2 = new outer.inner(); // give error.

        obj2.b=4;
        obj2.show();
    }
}
