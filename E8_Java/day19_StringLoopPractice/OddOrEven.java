package day19_StringLoopPractice;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            System.out.println("Would you like to enter another number? yes/no");
            String answer = scan.next().toLowerCase();
            if (!(answer.equalsIgnoreCase("yes")||answer.equalsIgnoreCase("no"))){
                System.err.println("Invalid entry");
                System.exit(0);
            }
            if (answer.equalsIgnoreCase("no")){
                break;
            }
        }
    }
}
