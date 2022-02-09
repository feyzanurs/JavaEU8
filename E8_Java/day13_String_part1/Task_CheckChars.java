package day13_String_part1;

import java.util.Scanner;

public class Task_CheckChars {
    public static void main(String[] args) {
        /*
        3. write a program that can check if the first and last characters of the string are same
            ex:
                level
            output:
                same
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Please enter a word");
        String word= input.nextLine();

        char first=word.charAt(0);
        char last=word.charAt(word.length()-1);

        if (first==last){
            System.out.println("same");
        }else{
            System.out.println("not same");
        }
    }
}
