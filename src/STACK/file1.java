package STACK;

public class file1 {
    public static void main(String[] args) {
        stack1<Integer> s = new stack1<>();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);
        s.push(60);
        s.push(70);
        s.push(80);
        s.pop();
        s.pop();
        s.pop();
        s.pop();
        s.push(200);
        s.display();
        System.out.println(s.pop());
    }
}
