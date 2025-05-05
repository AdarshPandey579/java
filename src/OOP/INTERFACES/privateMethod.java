package OOP.INTERFACES;

interface CAMERA{
    void takesnap();
    private void frame(){    // this cannot override in class and cannot accessible to main method
        System.out.println("16:10");
    }

    default void video(){
        frame(); // private method are use in default method to reduce complexity of default method
    }
}

class smartphone implements CAMERA{

    @Override
    public void takesnap() {
        System.out.println("take snap");
    }

    void frame(){   // this frame is different than above frame.
        System.out.println("10:9");
    }


}
public class privateMethod {
    public static void main(String[] args) {
        smartphone myphone = new smartphone();
        myphone.video();
        myphone.frame();
    }
}
