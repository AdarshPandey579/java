package LINKEDLIST;

class NODE3{
    int value;
    NODE3 next;

    NODE3(int val){
        this.value=val;
        this.next=null;
    }
}

class circuiarLL{
    NODE3 head=null;

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

public class CLL {
    public static void main(String[] args) {
        circuiarLL list = new circuiarLL();
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
