class Test{
    int a;
    Test(int i){
        a=i;
    }

    Test incTen(){  // method incTen

//        Test ob = new Test(a);
//        ob.a+=10;

        Test ob = new Test(a+10);

        return ob;  // constructor cannot return anything.
    }

}

public class returnObj {
    public static void main(String[] args) {
        Test obj1 = new Test(10) , obj2;
        obj2=obj1.incTen();
        System.out.println(obj1.a+" "+obj2.a);
    }
}
