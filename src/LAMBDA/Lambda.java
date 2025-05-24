package LAMBDA;

interface A{  // functional interface (consist only one abstract function)
    void fun();
//    void fun1(int i);  // it is necessary to define all abstract function in interface
}

interface B{
    int cal(int i,int j);
}

abstract class C{
    abstract int sum(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {

        A a = () -> System.out.println("hello");
        a.fun();

        B b = ((i, j) -> i+j);
        System.out.println(b.cal(10,20));

/*
         C c = ((m,n)->m+n);
         No, You can't do it. Lambdas have to target single abstract method (SAM) on interfaces,
         and they don't work with single abstract method on abstract classes.
         This how it is, and you have to accept it,

         Although it makes sense to have them,
         the language designers decided that it is not worth the complexity that will be
         introduced by allowing lambdas on SAM abstract classes.
*/
    }
}
