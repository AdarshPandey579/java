package LINKEDLIST.SINGLELL;

public class Reverse extends singleLL{
    public NODE2 reverseRecursion(NODE2 node){
        if (node==null){
            return null;
        }
        if (node.next==null){
            head=node;
            return head;
        }
        NODE2 ptr = reverseRecursion(node.next);
        ptr.next=node;
        node.next=null;
        return node;
    }

    public void reverse(NODE2 node){
        if (node==null){
            return;
        }
        if (node.next==null){
            return;
        }
        NODE2 prev=null,pres=node,next=node.next;
        while(pres.next!=null){
            pres.next=prev;
            prev=pres;
            pres=next;
            next=next.next;
        }
        pres.next=prev;
        head=pres;
    }
}
