package day13_String_part1;

public class CharAt_Method {
    public static void main(String[] args) {
        String word="Cydeo";
        //index:     01234
        char thirdChar=word.charAt(2);
        System.out.println("thirdChar = " + thirdChar);

        /*
        char tenthChar = word.charAt(9);
        System.out.println("tenthChar = " + tenthChar);
        Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 9
         */

    }
}
