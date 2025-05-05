package LINKEDLIST.SINGLELL;

class dupli extends singleLL {
    void Duplicate(){
        if (head == null) {
            return;
        }
        NODE2 ptr=head;
        while(ptr.next!=null){
            if(ptr.value==ptr.next.value){
                ptr.next=ptr.next.next;
            }
            else{
                ptr=ptr.next;
            }
        }
    }
}

public class duplicate {
    public static void main(String[] args) {
        dupli ll = new dupli();
        ll.InsertLast(1);
        ll.InsertLast(1);
        ll.InsertLast(1);
        ll.InsertLast(2);
        ll.InsertLast(2);
        ll.InsertLast(3);
        ll.InsertLast(4);
        ll.InsertLast(5);
        ll.InsertLast(5);

        ll.display();
        ll.Duplicate();
        ll.display();

    }
}
