package STATIC;

public class NonStaticInStatic {
    void func(){
        System.out.println("ABCD");
    }
    public static void main(String[] args) {
        // Non-static methods only access in static method
        // by creating object of that class in which function is associated.
        NonStaticInStatic obj=new NonStaticInStatic();
        obj.func();
    }
}

