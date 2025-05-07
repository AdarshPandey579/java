package TEST;

class A{
    int a;
    float b;
     A(int a, float b){

//         a=a*2;   // a assign self
//         b=b*2;

         this.a=a*2;  // this keyword differentiate the instances(class variable) and parameter.
         this.b=b*2;

         System.out.println(this.a+"  "+this.b);
         System.out.println(a+"  "+b);
     }
}

public class NoVariable {
    public static void main(String[] args) {
        new A(2,2.2f); // object created. memory is assigned.
    }
}
