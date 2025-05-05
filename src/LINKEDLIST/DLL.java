package LINKEDLIST;

class NODE1 {
    int value;
    NODE1 pre;
    NODE1 next;

    NODE1(int val){
        this.value=val;
        this.next=null;
        this.pre=null;
    }
}

class doubleLL {
    NODE1 head=null;
//========================================================================================

    void display(){
        if(head==null){
            System.out.println("null");
            return;
        }
        for(NODE1 temp = head; temp!=null; temp=temp.next){
            System.out.print(temp.value+" <-> ");
        }
        System.out.println("END");
    }

//========================================================================================

    void displayRev(){
        if(head==null){
            System.out.println("null");
            return;
        }
        NODE1 ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        for(NODE1 temp = ptr; temp!=null; temp=temp.pre){
            System.out.print(temp.value+" <-> ");
        }
        System.out.println("START");
    }

//========================================================================================

    void InsertFirst(int val){
        NODE1 node = new NODE1(val);
        node.next=head;
        head.pre=node;
        head=node;
    }

//========================================================================================

    void InsertLast(int val){
        NODE1 node = new NODE1(val);
        if(head==null){
            head=node;
            return;
        }
        NODE1 ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        node.pre=ptr;
        ptr.next=node;
    }

//========================================================================================

    void InsertPosition(int val,int ind){
        int size=0;
        if (ind==0){
            InsertFirst(val);
            return;
        }
        NODE1 node = new NODE1(val);
        NODE1 ptr=head;
        while(ptr!=null && size<ind-1){
            ptr=ptr.next;
            size++;
        }
        if(size==ind-1){
           node.next=ptr.next;
           node.pre=ptr;
            ptr.next=node;
           if(node.next!=null){
               node.next.pre=node;
           }
            return;
        }
        System.out.println(ind+" invalid position.");
    }

//=======================================================================================

    void DeleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        head=head.next;
        head.pre=null;
    }

//=======================================================================================

    void DeleteLast(){
        if(head==null){
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        NODE1 ptr=head;
        while(ptr.next.next!=null){
            ptr=ptr.next;
        }
        ptr.next=null;
    }

//========================================================================================

    void DeletePosition(int ind){
        int size=0;
        if(head==null){
            return;
        }
        if(ind==0){
            DeleteFirst();
        }
        NODE1 ptr=head;
        while(ptr!=null && size<ind-1){
            ptr=ptr.next;
            size++;
        }
        if(size==ind-1){
            ptr.next=ptr.next.next;
            if(ptr.next==null){ // important point if ptr.next == null means it is last element
                return;
            }
            else{
                ptr.next.pre=ptr;  // if ptr.next != null means it is not last element require previous link
            }
            return;
        }
        System.out.println(ind+" invalid index");
    }

//========================================================================================
}

public class DLL {
    public static void main(String[] args) {
        doubleLL list = new doubleLL();
        list.InsertLast(5);  //5 <-> END
        list.InsertFirst(6);  //6 <-> 5 <-> END
        list.InsertFirst(7);  //7 <-> 6 <-> 5 <-> END
        list.InsertFirst(8);  //8 <-> 7 <-> 6 <-> 5 <-> END
        list.InsertLast(4);  //8 <-> 7 <-> 6 <-> 5 <-> 4 <-> END
        list.InsertLast(3);  //8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.InsertPosition(11,0);  //11 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.InsertPosition(10,1);  //11 <-> 10 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.InsertPosition(9,2);  //11 <-> 10 <-> 9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.InsertPosition(1,9);  //11 <-> 10 <-> 9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> 1 <-> END
        list.InsertPosition(2,9);  //11 <-> 10 <-> 9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> END
//        list.InsertPosition(1,900);
        list.DeleteFirst();  //10 <-> 9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> END
        list.DeleteFirst();  //9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> 1 <-> END
        list.DeleteLast();  //9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> 2 <-> END
        list.DeleteLast();  //9 <-> 8 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.DeletePosition(1);  //9 <-> 7 <-> 6 <-> 5 <-> 4 <-> 3 <-> END
        list.DeletePosition(5);  //9 <-> 7 <-> 6 <-> 5 <-> 4 <-> END


        list.display();
        list.displayRev();
    }
}
