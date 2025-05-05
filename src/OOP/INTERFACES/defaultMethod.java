package OOP.INTERFACES;

interface camera{
    void takesnap();
    default void record4K(){
        System.out.println("recording in 4K");
    }
}

class smart_phone implements camera{
    public void takesnap(){
        System.out.println("taking snap");
    }

//    public void record4K(){
//        System.out.println("taking snap and record in 4k");
//    }


}
public class defaultMethod {

    public static void main(String[] args) {
        smart_phone myphone = new smart_phone(); // reference and object both of smart_phone
        myphone.record4K();

        camera _my_phone = new smart_phone();  // reference camera and object smart_phone
        _my_phone.record4K();
    }
}

