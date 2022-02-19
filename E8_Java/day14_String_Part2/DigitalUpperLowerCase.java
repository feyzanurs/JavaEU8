package day14_String_Part2;

import java.util.Scanner;

public class DigitalUpperLowerCase {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a word:");
        String word= scan.next();
        scan.close();

        char firstChar=word.charAt(0);
        String result="";

        if (firstChar >= '0'&& firstChar<='9'){
            result="first character is digit";
        }else if (firstChar >= 'a' && firstChar<='z'){
            result="first character is lower case";
        }else if (firstChar >= 'A'&& firstChar<='Z'){
            result= "first character is upper case";
        }else{
            result="first character is special character";
        }
    }
}
