package day17_while_doWhileLoop;

import java.util.Scanner;

public class BranchingStatements {
    public static void main(String[] args) {
        for (char i = 'A'; i <='Z' ; i++) {
            if (i == 'F') {
                break; // exists the loop
            }
            System.out.print(i + " ");
        }
        System.out.println("\n---------statement placed before break----------------");
        for (char i = 'A'; i <='Z' ; i++) {
            System.out.print(i + " ");

            if (i == 'F') {
                break; // exists the loop
            }
        }
        System.out.println("\n---------while loop break----------------");
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Enter a number");
            int num=scan.nextInt();
            if (num<0){
                break;
            }
        }
    }
}
