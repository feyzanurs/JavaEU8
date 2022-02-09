package day13_String_part1;

import java.util.Scanner;

public class Task_WordChecking {
    public static void main(String[] args) {
        /*
         write a program that asks the user enter a three letters word.
         Check if the middle character of the given word is 'a'. In the case it is print: "Cool word",
         but in the case the middle letter is not 'a' print: "Okay word".
     - If the user does not enter a 3 letters word tell them:
             If the word is less than 3 letters: "Word is too short"
             If the word is too long: "Word is too long"
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a 3letters word");
        String word=input.next();
        int l=word.length();
        char a=word.charAt(1);
        if(l<3){
            System.out.println("Word is too short");
        }else if(l>3){
            System.out.println("Word is too long");
        } else if (a=='a'){
            System.out.println("Cool word");
        }else{
            System.out.println("Okay word");
        }


    }
}
