package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod_Split {
    public static void main(String[] args) {
        String sentence="Wooden Spoon";
        String[] words=sentence.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println("------------------------------");

        String email="Woodenspoon@cydeo.com";
        String [] arr= email.split("@");
        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------");

        String s= "Today is nice day. Today is Monday. Today we learn Java";
        String[] sentences=s.split("\\. "); // double slash is needed if you want to separate from dot.
        System.out.println(Arrays.toString(sentences));


    }
}
