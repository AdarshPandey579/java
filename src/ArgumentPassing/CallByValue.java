package ArgumentPassing;

class Test1 {
    void change(int i , int j){
        i*=2;
        j/=2;
    }
}

public class CallByValue {
    public static void main(String[] args) {
        int a=5, b=10;
        System.out.println(a+" "+b);
        Test1 obj = new Test1();
        obj.change(a,b);
        System.out.println(a+" "+b);
    }
}
