package OOP.INTERFACES;

interface cycle {
    void breaks();
    int a=3; //it is static and final
    void start();
}
class bicycle implements cycle {
    int x=20;

    @Override
    public void breaks() {
        System.out.println("Apply break");
    }

    @Override
    public void start() {
        System.out.println("pedal the cycle");
    }
}

class INTERFACE{
    public static void main(String[] args) {
        System.out.println(cycle.a); // directly access variable from interfaces using interface name

        bicycle x = new bicycle();
        System.out.println(x.a); // access variable through object of class which inherit property from interface

//        cycle y = new cycle(); cannot create object of interface
    }
}