package LINKEDLIST.SINGLELL;

public class merge {
    static void MERGE(singleLL l1, singleLL l2){
        singleLL list = new singleLL();
        NODE2 ptr1 = l1.head;
        NODE2 ptr2 = l2.head;

        while(ptr1!=null && ptr2!=null){
            if(ptr1.value==ptr2.value){
                list.InsertLast(ptr1.value);
                ptr1=ptr1.next;
            } else if (ptr1.value < ptr2.value) {
                list.InsertLast(ptr1.value);
                ptr1=ptr1.next;
            }
            else {
                list.InsertLast(ptr2.value);
                ptr2=ptr2.next;
            }
        }
        while(ptr1!=null){
            list.InsertLast(ptr1.value);
            ptr1=ptr1.next;
        }
        while(ptr2!=null){
            list.InsertLast(ptr2.value);
            ptr2=ptr2.next;
        }

        list.display();
    }
    public static void main(String[] args) {
        singleLL l1 = new singleLL();
        singleLL l2 = new singleLL();
        l1.InsertLast(1);
        l1.InsertLast(1);
        l1.InsertLast(2);
        l1.InsertLast(3);
        l1.InsertLast(4);
        l1.InsertLast(4);
        l1.InsertLast(5);
        l1.display();

        l2.InsertLast(1);
        l2.InsertLast(2);
        l2.InsertLast(4);
        l2.InsertLast(8);
        l2.InsertLast(9);
        l2.InsertLast(11);
        l2.InsertLast(19);
        l2.InsertLast(21);
        l2.display();

        MERGE(l1,l2);
    }
}
