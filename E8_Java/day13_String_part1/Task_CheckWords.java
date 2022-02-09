package day13_String_part1;

import java.util.Scanner;

public class Task_CheckWords {
    public static void main(String[] args) {
        /*
        Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"
         */
        Scanner input= new Scanner(System.in);
        System.out.println("Please enter your word");
        System.out.println("The first word:");
        String word1= input.next();
        int l1= word1.length();
        System.out.println("The second word:");
        String word2= input.next();
        int l2=word2.length();
        System.out.println("The third word:");
        String word3= input.next();
        int l3=word3.length();
        if (l1==l2 && l2==l3 && l1==l3){
            System.out.println("All words are same length");
        }else if (l1==l2 || l2==l3 || l1==l3){
            System.out.println("Not Same nor Different lengths");
        }else{
            System.out.println("All different length");
        }

    }
}
