package LINKEDLIST.CIRCULARLL;
import LINKEDLIST.SINGLELL.singleLL;

public class CLL {
    public static void main(String[] args) {
        singleLL a = new singleLL();

        circularLL list = new circularLL();
        list.InsertFirst(4);  // 4 -> 4
        list.InsertFirst(5);  // 5 -> 4 -> 5
        list.InsertLast(3);  // 5 -> 4 -> 3 -> 5
        list.InsertLast(2);  // 5 -> 4 -> 3 -> 2 -> 5
        list.InsertPosition(9,0);  //9 -> 5 -> 4 -> 3 -> 2 -> 9
        list.InsertPosition(8,1);  //9 -> 8 -> 5 -> 4 -> 3 -> 2 -> 9
        list.InsertPosition(7,2);  //9 -> 8 -> 7 -> 5 -> 4 -> 3 -> 2 -> 9
//        list.InsertPosition(1,8);  //8 invalid index.
        list.InsertPosition(1,7);  //9 -> 8 -> 7 -> 5 -> 4 -> 3 -> 2 -> 1 -> 9
        list.InsertPosition(0,8);  //9 -> 8 -> 7 -> 5 -> 4 -> 3 -> 2 -> 1 -> 0 -> 9
        list.InsertPosition(6,3);  //9 -> 8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> 0 -> 9
        list.DeleteFirst();  //8 -> 7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> 0 -> 8
        list.DeleteFirst();  //7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> 0 -> 7
        list.DeleteLast();  //7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 1 -> 7
        list.DeleteLast();  //7 -> 6 -> 5 -> 4 -> 3 -> 2 -> 7
        list.DeletePosition(0);  //6 -> 5 -> 4 -> 3 -> 2 -> 6
        list.DeletePosition(1);  //6 -> 4 -> 3 -> 2 -> 6
        list.DeletePosition(3);  //6 -> 4 -> 3 -> 6
        list.DeletePosition(2);  //6 -> 4 -> 6

        list.display();
    }
}
