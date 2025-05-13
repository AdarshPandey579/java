package LINKEDLIST.CIRCULARLL;

public class circularLL {
    static NODE3 head=null;

//==========================================================================================

    void display(){
        NODE3 temp = head;
        if(head==null){
            System.out.println("null");
            return;
        }
        do{
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }while(temp!=head);
        System.out.println(head.value);
    }

//==========================================================================================

    void InsertFirst(int val){
        NODE3 node =new NODE3(val);
        if(head==null){
            head=node;
            node.next=node;
            return;
        }
        node.next=head;
        NODE3 ptr=head;
        while(ptr.next!=head){
            ptr=ptr.next;
        }
        ptr.next=node;
        head=node;
    }

//==========================================================================================

    void InsertLast(int val){
        NODE3 node = new NODE3(val);
        if(head==null){
            head=node;
            node.next=node;
            return;
        }
        NODE3 ptr=head;
        while(ptr.next!=head){
            ptr=ptr.next;
        }
        ptr.next=node;
        node.next=head;
    }

//==========================================================================================

    void InsertPosition(int val,int ind){
        if (ind==0){
            InsertFirst(val);
            return;
        }
        int size=0;
        NODE3 node = new NODE3(val);
        NODE3 ptr=head;
        while(ptr.next!=head && size<ind-1){
            ptr=ptr.next;
            size++;
        }
        if(size==ind-1){
            node.next=ptr.next;
            ptr.next=node;
            return;
        }
        System.out.println(ind+" invalid index.");
    }

//==========================================================================================

    void DeleteFirst(){
        if(head==null){
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        NODE3 ptr=head;
        while(ptr.next!=head){
            ptr=ptr.next;
        }
        ptr.next=head.next;
        head=head.next;
    }

//===========================================================================================

    void DeleteLast(){
        if(head==null){
            return;
        }
        if(head.next==head){
            head=null;
            return;
        }
        NODE3 ptr=head;
        while(ptr.next.next!=head){
            ptr=ptr.next;
        }
        ptr.next=head;
    }

//============================================================================================

    void DeletePosition(int ind){
        if(head==null){
            return;
        }
        if(ind==0){
            DeleteFirst();
            return;
        }
        int size=0;
        NODE3 ptr=head;
        while(ptr.next!=head && size<ind-1){
            ptr=ptr.next;
            size++;
        }
        if(size==ind-1){
            ptr.next=ptr.next.next;
            return;
        }
        System.out.println(ind+" invalid ind.");
    }

//============================================================================================
}
