package QUEUE;

import java.util.ArrayList;

public class queue<E> {
    int r=-1,f=-1;
    ArrayList<E> q = new ArrayList<>();

    void add(E val){
        r++;
        q.add(val);
        if(f==-1){
            f=0;
        }
    }

    E delete(){
        if(f==-1){
            System.out.println("Queue is empty");
            return null;
        }
        if(f==r){
            E a=q.get(f);  // remove reduce the size of list.
            q.clear();  // clear delete every element in list.
            f=-1;
            r=-1;
            return a;
        }
        E a = q.get(f);
        f++;
        return a;
    }

    void display(){
        if(f==-1){
            return;
        }
        for(int i=f;i<=r;i++){
            System.out.println(q.get(i));
        }
    }
}