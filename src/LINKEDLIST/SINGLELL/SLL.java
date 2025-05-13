package LINKEDLIST.SINGLELL;

public class SLL {
    public static void main(String[] args) {
        Reverse list = new Reverse();
        list.InsertFirst(2);
        list.InsertFirst(3);
        list.InsertFirst(4);
        list.InsertLast(1);
        list.InsertPosition(6,0);
        list.InsertPosition(5,1);
        list.InsertPosition(0,6);
        list.InsertFirst(8);
        list.InsertPosition(7,1);
//        list.InsertPosition(7,23);
        list.DeleteFirst();
        list.DeleteLast();
        list.DeletePosition(4);
        list.DeletePosition(5);
//        list.DeletePosition(6);

        list.display();


//        list.reverseRecursion(list.head);
        list.reverse(singleLL.head);

        list.display();


//        System.out.println(list.head.value);
    }
}
