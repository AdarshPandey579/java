package LINKEDLIST.SINGLELL;

class NODE2 {
    int value;
    NODE2 next;

    NODE2(int val){
        this.value=val;
        this.next=null;
    }
}

class singleLL {
   NODE2 head = null;

//-------------------------------------------------------------------------------------------

   void display(){
       if(head==null){
           System.out.println("null");
           return;
       }
       for(NODE2 temp = head; temp!=null; temp=temp.next){
           System.out.print(temp.value+" -> ");
       }
       System.out.println("END");
   }

//--------------------------------------------------------------------------------------------

    void InsertFirst(int val){
        NODE2 node = new NODE2(val);
        if (head == null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

//---------------------------------------------------------------------------------------------

    void InsertLast(int val){
        NODE2 node = new NODE2(val);
        if(head==null){
            head=node;
            return;
        }
        NODE2 ptr=head;
        while(ptr.next!=null){
            ptr=ptr.next;
        }
        ptr.next=node;
    }

//---------------------------------------------------------------------------------------------

    void InsertPosition(int val,int ind){
       int size=0;
       if (ind==0){
           InsertFirst(val);
           return;
       }
        NODE2 node = new NODE2(val);
        NODE2 ptr=head;
       while(ptr!=null && size<ind-1){ // ptr point previous to target node
           ptr=ptr.next;
           size++;
       }
       if(size==ind-1){
           node.next=ptr.next;
           ptr.next=node;
           return;
       }
        System.out.println(ind+" invalid position ");
    }

//---------------------------------------------------------------------------------------------

     void DeleteFirst(){
       if(head==null){
           return;
       }
       if(head.next==null){
           head=null;
           return;
       }
       head=head.next;
     }

//----------------------------------------------------------------------------------------------

    void DeleteLast(){
       if(head==null){
           return;
       }
       if(head.next==null){
           head=null;
           return;
       }
       NODE2 ptr=head;
       while(ptr.next.next!=null){
           ptr=ptr.next;
       }
       ptr.next=null;
    }

//----------------------------------------------------------------------------------------------

    void DeletePosition(int ind){
       if(head==null){
           return;
       }
       if(ind==0){
           head=head.next;
           return;
       }
       int size=0;
       NODE2 ptr=head;
       while(ptr.next!=null && size<ind-1){
           ptr=ptr.next;
           size++;
       }
       if(size==ind-1){
           ptr.next=ptr.next.next;
           return;
       }
        System.out.println(ind+" invalid index");
    }
//----------------------------------------------------------------------------------------------
}

public class SLL {
    public static void main(String[] args) {
        singleLL list = new singleLL();
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
//        System.out.println(list.head.value);
    }
}
