package ArgumentPassing;

class Test2{
    int A,B;
    Test2(int a , int b){
        A=a;
        B=b;
    }

    Test2(Test2 ob){
        ob.A*=2;
        ob.B/=2;
    }
}

public class CallByRefrence {
    public static void main(String[] args) {
        Test2 obj = new Test2(5,10);
        System.out.println(obj.A+" "+obj.B);

        new Test2(obj);
        System.out.println(obj.A+" "+obj.B);

    }
}
