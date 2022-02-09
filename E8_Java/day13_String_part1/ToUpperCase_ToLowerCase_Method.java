package day13_String_part1;

public class ToUpperCase_ToLowerCase_Method {
    public static void main(String[] args) {
        String str= "wooden spoon";
        str = str.toUpperCase();// new string object will be created as "WOODEN SPOON" unless u assigned it back
        System.out.println(str); // output is lower case unless u assign str to the method.

        String sentence="Today is a great day to learn java programming language";
        sentence=sentence.toUpperCase();
        System.out.println(sentence);



    }
}
