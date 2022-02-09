package day13_String_part1;

import java.util.Scanner;

public class Task_LongestString {
    public static void main(String[] args) {
        /*
        write a program that asks user to enter two strings, and print out the longest string
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two sentence");
        System.out.println("the first sentence");
        String s1= input.nextLine();
        System.out.println("the second sentence");
        String s2= input.nextLine();

        int l1=s1.length();
        int l2=s2.length();
        if (l1>l2){
            System.out.println(s1+"-"+l1+" chars");
        }else{
            System.out.println(s2+"-"+l2+" chars");
        }

    }
}
