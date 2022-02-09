package day13_String_part1;

import java.util.Scanner;

public class Task_Sentence {
    public static void main(String[] args) {
        /*
        1. write a program that asks user to enter a sentence.
           then print the first & last characters of the sentence
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String sentence= input.nextLine();
        char f= sentence.charAt(0);
        char l= sentence.charAt(sentence.length()-1);
        String fl= f+" and "+l;
        System.out.println("First and last letter of the sentence is: "+fl);
    }
}
