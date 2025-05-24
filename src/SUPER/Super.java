package SUPER;

class ParentClass {
    ParentClass(){
        System.out.println("hello");
    }
    ParentClass(int i){
        System.out.println("hello"+i);
    }
    public boolean isTrue() { return true; }
}

class ChildClass extends ParentClass {
    ChildClass(){
        super();
    }
    ChildClass(int i){
        super(i);
    }
    public boolean isTrue()
    {
        // calls parent implementation of isTrue()
        boolean parentResult = super.isTrue();
        // negates the parent result
        return !parentResult;
    }
}



public class Super {
    public static void main(String[] args)
    {
        ChildClass child = new ChildClass(10);

        // calls child implementation
        // of isTrue()
        boolean result = child.isTrue();

        System.out.println(result);
    }
}
