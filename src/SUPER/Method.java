package SUPER;

class C{
    void f(){
        System.out.println("hello parent");
    }
    void f(int i){
        System.out.println("this is parent "+i);
    }
    void f(float j){
        System.out.println("this is parent "+j);
    }
}

class D extends C{

    void fun(){
        super.f();
    }

    void fun(int i){
        super.f();
        super.f(i);
    }

    void fun(int i,float j){
        super.f();
        super.f(i);
        super.f(j);
    }
}

public class Method {
    public static void main(String[] args) {
        new D().fun();  //anonymous object.
        System.out.println();
        new D().fun(19);
        System.out.println();
        new D().fun(20,3.14f);
    }

}
