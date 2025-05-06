package STATIC;

public class StaticInNonStatic {
    static void func(){
        System.out.println("ABCD");
    }
    public static void main(String[] args) {

        func();  // static method are directly access in static method

        //=============================================================

        StaticInNonStatic obj=new StaticInNonStatic(); // static method also access by creating object of class
                                                       // in which function is associated.
        obj.func();
    }
}
