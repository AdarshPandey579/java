package QUEUE;

public class file {
    public static void main(String[] args) {
        queue<Character> q = new queue<>();
        q.add('a');
        q.add('b');
        q.add('c');
        q.add('d');
        q.add('e');
        q.add('f');
        q.add('g');
        q.add('h');
        q.add('i');
        q.add('j');
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();

        q.add('e');
        q.display();
    }
}

