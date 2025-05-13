package TEST;

class Test1 {

    int a;

    Test1(int i){
        a=i;
    }
    Test1 incTen(){  // method incTen
//        Test ob = new Test(a);
//        ob.a+=10;

        Test1 ob = new Test1(a+10);
        return ob;  // constructor cannot return anything.
    }

}

public class returnObj {
    public static void main(String[] args) {
        Test1 obj1 = new Test1(10) , obj2;
        obj2=obj1.incTen();
        System.out.println(obj1.a+" "+obj2.a);
    }
}
