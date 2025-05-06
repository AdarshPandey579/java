package LINKEDLIST.SINGLELL;

class pointing extends singleLL{
    void point(int pos){
        int size=1;
        NODE2 ptr1 = head , ptr2 = head;
        while(size!=pos){
            ptr2=ptr2.next;
            size++;
        }
        while(ptr1.next!=null){
            System.out.print(ptr1.value+" -> ");
            ptr1=ptr1.next;
        }
        System.out.print(ptr1.value+" -> ");
        ptr1.next=ptr2;
        System.out.println(ptr2.value);
    }
}

public class Cycle {

    // check any cycle present in linked list or not.

    static void cycle(singleLL ll){
        NODE2 fast = ll.head.next.next;
        NODE2 slow = ll.head;
       while(fast!=slow && fast!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
       if (fast==slow){
           System.out.println("CYCLE PRESENT");
           return;
       }
       System.out.println("CYCLE NOT PRESENT");
    }

    // find the length of cycle

    static int length(singleLL ll){
        int l=0;
        NODE2 fast = ll.head.next.next;
        NODE2 slow = ll.head;
        while(fast!=slow && fast!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        if (fast==slow){
            do{
                slow=slow.next;
                l++;
            }while(slow!=fast);
            return l;
        }
        return l;
    }

    // starting node of cycle

    static void cycleStart(singleLL ll){
        int l = length(ll);
        NODE2 f=ll.head , s=ll.head;
        while(l>0){
            s=s.next;
            l--;
        }
        while(f!=s){
            s=s.next;
            f=f.next;
        }
        System.out.println("Starting node is "+s.value);
    }

    public static void main(String[] args) {
        pointing list = new pointing();
        list.InsertLast(1);
        list.InsertLast(2);
        list.InsertLast(3);
        list.InsertLast(4);
        list.InsertLast(5);
        list.InsertLast(6);
        list.InsertLast(7);
        list.InsertLast(8);

        list.point(6);  // 1 -> 2 -> 3 -> 4 -> 5 -> 6 -> 7 -> 8 -> 3


        cycle(list);
        System.out.println("Length of cycle is "+length(list));
        cycleStart(list);
    }
}
