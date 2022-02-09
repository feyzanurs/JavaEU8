package day13_String_part1;

import java.util.Scanner;

public class Task_CheckStrings {
    public static void main(String[] args) {
        /*
        Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        int str=word.length();
        char a=word.charAt(word.length()-1),b=word.charAt(word.length()-2),c=word.charAt(word.length()-3);
        if (str==0){
            System.out.println("String is empty");
        }else if (str>3){
            System.out.println(c+""+b+""+a);
        }else if (str<=3){
            System.out.println(word);
        }
    }
}
