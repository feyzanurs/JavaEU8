package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("Enter your age");
        int age= input.nextInt();
        input.nextLine(); // after another method, enter nextLine() if you want to input after pressing the Enter key!
        System.out.println("Enter your full name");
        String fullName= input.nextLine();
        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);
    }
}
