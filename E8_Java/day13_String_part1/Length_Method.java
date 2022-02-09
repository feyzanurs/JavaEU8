package day13_String_part1;

public class Length_Method {
    public static void main(String[] args) {
        String s1="Batch 25 is the best batch";

        int totalChar= s1.length();
        System.out.println("totalChar = " + totalChar);

        char lastChar=s1.charAt(totalChar-1);
        System.out.println("lastChar = " + lastChar); //or
        char lastChars=s1.charAt(s1.length()-1);
        System.out.println("lastChars = " + lastChars); // same output

    }
}
