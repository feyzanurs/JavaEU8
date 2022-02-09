package day13_String_part1;

public class String_Intro {

    public static void main(String[] args) {

        //String Literal
        String name="Wooden Spoon";
        String name1="Wooden Spoon";
        String name2="Wooden Spoon";
        String name3="Wooden Spoon";
        String name4="Wooden Spoon";

        System.out.println(name== name2);//true
        System.out.println(name1==name3);
        System.out.println(name4==name);

        //New Keyword
        System.out.println("\n=================\n");

        String str1=new String("Wooden Spoon");
        String str2=new String("Wooden Spoon");
        String str3=new String("Wooden Spoon");
        String str4=new String("Wooden Spoon");

        System.out.println(str1==str2);
        System.out.println(str2==str3);
        System.out.println(str3==str4);

        System.out.println("-------------------------");

        String s1="Java";
        String s2=new String("Java");
        //in order to compare the sequence of the characters, not the objects, use the method as it follows;
        System.out.println(s1.equals(s2)); //>> instead of using the operator "==" as it is above.
        String s3="Java";
        String s4= new String("java");
        System.out.println(s3.equals(s4)); // because Java is case-sensitive.





    }
}
