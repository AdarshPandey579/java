package ANONUMOUS;

interface CO { // not required functional interface.
    void fun1();
    int fun2(int i);
}

public class ObjAndClass {
    public static void main(String[] args) {
        new CO() {
            @Override
            public void fun1() {
                System.out.println("hello");
            }

            @Override
            public int fun2(int i) {
                return i*2;
            }
        }.fun1(); // only one method is accessible .
    }
}
