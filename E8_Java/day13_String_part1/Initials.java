package day13_String_part1;

import java.util.Scanner;

public class Initials {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Please Enter your First Name:");
        String name= input.next();
        System.out.println("Please Enter your Last Name:");
        String lastName= input.next();

        char f= name.charAt(0);
        char l= lastName.charAt(0);
        String initial= f+"."+l;

        System.out.println("initial = " + initial);
    }
}
