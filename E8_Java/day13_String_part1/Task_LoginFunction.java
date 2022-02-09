package day13_String_part1;

import java.util.Scanner;

public class Task_LoginFunction {
    public static void main(String[] args) {
        /*
        You are writing a code for the log-in function of the Cybertek Application, assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon
        Ask the user to enter their credentials. If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message
    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method
         */
        Scanner input= new Scanner(System.in);
        System.out.println("****Cybertek Application****");
        System.out.println("Username:");
        String username=input.nextLine();
        System.out.println("Password:");
        String password= input.nextLine();
        String username1="Cydeo";
        String password1="WoodenSpoon";
        if(username.equals(username1) && password.equals(password1)){
            System.out.println("LOGGED IN");
        }else{
            System.err.println("Incorrect username or password");
        }
    }
}
