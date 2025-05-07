package OOP.POLYMORPHISM.OVERLOADING;

class box{
    int w;
    int h;
    int l;

    box(int length, int width , int heigth){
        this.l=length;
        this.h=heigth;
        this.w=width;
    }

//    box(){
//        System.out.println(l*w*h);

    int box(){
        return l*w*h;
    }

}

public class Constructor {
    public static void main(String[] args) {
        box b = new box(2,2,2);  // this box is constructor.
        int c = b.box(); // this box is method.
        System.out.println(c);
    }
}
