package day17_while_doWhileLoop;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Log_in {
    public static void main(String[] args) {
       // username:"Cydeo"
       // password: "Cydeo123"

        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your username:");
        String user= scan.next();
        System.out.println("Please enter your password:");
        String password= scan.next();
        if (user.equals("Cydeo")&& password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts=3;
            while(!(user.equals(("Cydeo")) && password.equals("Cydeo123")) && attempts>0){
                if (attempts==1){
                    System.err.println("THIS IS YOUR LAST ATTEMPT");
                }
                System.err.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                user= scan.next();

                System.out.println("Enter your password");
                password= scan.next();
                attempts--;
            }
            if (user.equals("Cydeo")&& password.equals("Cydeo123")){
                System.out.println("Logged in successfully");
            }else{
                System.err.println("Your account is locked, please contact with your administrator");
            }
        }


    }
}
/*
 Ask the user to enter their credentials.
  If credentials are matched, your program should print "Logged in."
  If the credentials are not matched,
  the program should allow the user to have three attempts to enter correct credentials and
  if all three attempts are failed, then print "Your account is locked."
 */