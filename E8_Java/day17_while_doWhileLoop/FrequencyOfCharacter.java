package day17_while_doWhileLoop;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str= "AAAABBBCAAAAAAAAAAAAAAAAAAAA";
        char ch='A';
        int frequency= 0;
        for (int i = 0; i <=str.length()-1; i++) { //i: indexes of str
            char eachChar=str.charAt(i); // eachChar: each character of str

            if ( ch==eachChar){// if given ch is matching with the eachChar, then ch is appeared ib the string
                frequency++;

            }
        }
        System.out.println(frequency);
    }
}
        /*
        1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
         */