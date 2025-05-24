package ANONUMOUS;

class a{
    void func(){
        System.out.println("hello");
    }
    void func(int i){
        System.out.println(i+" is input.");
    }
}

public class OBJECT {
    public static void main(String[] args) {

        new a().func();
        new a().func(10);
    }
}
