package day16_ForLoops_StringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str="Cydeo12345School!@#$%ˆWoodenSpoon",
       digits="", //Digits>> 12345
       letters="", //Letters>> CydeoWoodenSpoon
       specialChars="";//SpecialChars>>!@#$%ˆ
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i); // every single chars in str
            if (ch >= '0' && ch <= '9') {
                digits += ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                letters += ch;
            } else if (ch >= 'a' && ch <= 'z') {
                letters += ch;
            } else
                specialChars += ch;
        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);
    }

}


