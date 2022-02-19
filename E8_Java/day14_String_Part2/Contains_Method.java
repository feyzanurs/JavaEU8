package day14_String_Part2;

public class Contains_Method {
    public static void main(String[] args) {
        String sentence="My favorite programming language is Java";

      boolean hasJava=  sentence.contains("Java");
        System.out.println(hasJava);
      boolean hasJava2= sentence.toLowerCase().contains("java");
        System.out.println(hasJava2);

      boolean hasCsharp= sentence.contains("C#");
        System.out.println(hasCsharp);
        System.out.println("---------------------");

        String input1="I love jAvA",
                input2="Java";
        System.out.println(input1.equals(input2));//false
        System.out.println(input1.equalsIgnoreCase(input2));//true
        System.out.println(input1.contains("Java"));//false

        System.out.println(input1.toLowerCase().contains("java")); //true
                                                                    // only way to ignore case sensitivity with contains
        System.out.println(input1.toUpperCase().contains("JAVA")); //true
    }
}
