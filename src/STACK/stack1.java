package STACK;

import java.util.ArrayList;

public class stack1<E>{
    int tos=-1;

    ArrayList<E> s = new ArrayList<>();

    void push(E val){
        tos++;
        s.add(val);
    }

    E pop(){
        if(tos==-1){
            System.out.println("stack is empty");
            return null;
        }
        E e = s.remove(tos);
        tos--;
        return e;
    }

    void display(){
        int i = tos;
        while(i>=0){
            System.out.println(s.get(i));
            i--;
        }
    }
}
