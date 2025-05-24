package EXCEPTION;

import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "Invalid age.";
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
        if(a>=18){
            System.out.println("Eligible for vote.");
            return;
        }
        System.out.println("Not eligible for vote.");
    }
}
