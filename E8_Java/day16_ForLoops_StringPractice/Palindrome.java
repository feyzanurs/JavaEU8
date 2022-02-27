package day16_ForLoops_StringPractice;

public class Palindrome {
    public static void main(String[] args) {
        /*
        "Java" = avaJ >> false
        "Anna" = annA >> true
        "Level" "Dad"
        "Racecar" "Mom"

         */
        String word= "Level";
        String reversed="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reversed+=word.charAt(i);
        }
        boolean isPalindrome=word.equalsIgnoreCase(reversed);
        System.out.println(reversed+" is palindrome");
    }
}
