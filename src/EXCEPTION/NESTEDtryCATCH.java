package EXCEPTION;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NESTEDtryCATCH {
    public static void main(String[] args) {
        int a;
        Scanner sc =new Scanner(System.in);
        while(true){
            try{
                System.out.print("Enter the num:");
                a=sc.nextInt();
                try{
                    System.out.println("1000 divide by "+a+" is "+1000/a);
                }
                catch (Exception e){  //ArithmeticException
                    System.out.println(e);
                    break;
                }
            }
            catch (InputMismatchException e){
                System.out.println(e);
                break;
            }
        }
    }
}
