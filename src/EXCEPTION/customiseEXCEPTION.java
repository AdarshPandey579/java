package EXCEPTION;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "age not 0 , 100 or negative. ";
    }
}

public class customiseEXCEPTION {
    public static void main(String[] args) {
        int a;
        System.out.print("Enter the age:");
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        if(a>100 || a<=0){
            try{
                throw new MyException();
            }
            catch (Exception e){
                System.out.println(e);
                return;
            }
        }
        System.out.println(a);
    }
}
