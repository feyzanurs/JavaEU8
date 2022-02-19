package day15_ForLoops;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {
        int max=-2142353453; // Any number will be entered by user will be greater than this number

        for (int i=0; i<5;i++){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a number:");
            int num=scan.nextInt();
            if (num>max){
                max=num;
            }
        }

        System.out.println("max = " + max);
    }
}
