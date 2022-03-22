package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice2 {
    public static void main(String[] args) {
        char[]letters=new char[26];
      /*  letters[0]='A';
        letters[2]='B';

       */
        for (char i = 'A', j=0; i <='Z' && j< letters.length ; i++,j++) {
            // one data type can be used for multiple variables
            letters[j]=i;

        }
        System.out.println(Arrays.toString(letters));//[A-Z]
        System.out.println("----------------------------");
        char [] letters2=new char[26];

        char ch='Z';
        for (int i = 0; i < letters.length; i++,ch--) {
            letters2[i]=ch;


        }



        System.out.println(Arrays.toString(letters2));
    }
}
