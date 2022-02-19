package day14_String_Part2;

public class Equals_EqualsIgnoreCase {
    public static void main(String[] args) {
        String s1="CYDEO",
               s2="School";
        System.out.println(s1.equals(s2)); //true
        System.out.println(s1.equalsIgnoreCase(s2));//true

        // Yes,YES,yEs,yES,YEs...
        System.out.println("YEs".equalsIgnoreCase("Yes"));
    }
}
