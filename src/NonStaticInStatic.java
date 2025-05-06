public class NonStaticInStatic {
    void func(){
        System.out.println("ABCD");
    }
    public static void main(String[] args) {
//        int $a=0;
//        System.out.println($a);

        NonStaticInStatic obj=new NonStaticInStatic();
        obj.func();
    }
}

