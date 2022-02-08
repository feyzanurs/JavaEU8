package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {
    public static void main(String[] args) {
        // NextLine() method reads EVERYTHING written.
        Scanner input=new Scanner(System.in); //
        System.out.println("Please enter your full name:");
        String name= input.nextLine();
        System.out.println("Enter your Programming lang:");
        String language= input.nextLine();
        System.out.println("Enter your age:");
        int age= input.nextInt(); //24Enter >> "Enter" will not be executed,but stored in Scanner

        input.nextLine(); // in order to enter input on next line needed to be written, otherwise you cannot put
        // information from console, because when you press enter key it will execute the whole code.
        // it is ONLY needed if you are using another method after the Nextline() method.
        //i.e. nextLine(), nextLine(), nextInt() >> nexLine() >> nextLine()

        System.out.println("Enter your School Name");
        String school= input.nextLine(); // you cannot enter any input


        System.out.println("name = " + name);
        System.out.println("language = " + language);
        System.out.println("age = " + age);
        System.out.println("school = " + school);


    }

}
