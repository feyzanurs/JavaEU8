package day15_ForLoops;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {
        int min = 900000000; // Any number will be entered by user will be smaller than this number

        for (int i = 0; i < 5; i++) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            if (num < min) {
                min = num;
            }
        }

        System.out.println("min = " + min);
    }
}
