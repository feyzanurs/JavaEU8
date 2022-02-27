package day16_ForLoops_StringPractice;

public class UniqueChar {
    public static void main(String[] args) {
    String str="AABCCD", result="";

        for (int i = 0; i <=str.length()-1 ; i++) { //i refer to index numbers of str starting from 0.
            char ch=str.charAt(i);
            //System.out.println(ch);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){ // if the first and last index num of char is same meaning char is unique.
                result+=ch;
        }
    }
        System.out.println(result);
  }
}
/*
Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique


 */