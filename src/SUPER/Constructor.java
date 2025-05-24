package SUPER;

class A{
    A(){
        System.out.println("hello parent");
    }

    A(int i){
        System.out.println("hello parent "+i);
    }
}

class B extends A{
    B(){
        super(10);
    }

    B(int i){
//        super();
        super(i);
    }
}


public class Constructor {
    public static void main(String[] args) {
        B obj1 = new B();
        B obj2 = new B(20);
    }
}
