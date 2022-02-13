package day14_String_Part2;

public class IndexOf_lastIndexOf {
    public static void main(String[] args) {
        String str= "Cydeo School";
      int n= str.indexOf("h");
        System.out.println("n= "+n);

      int n1=str.indexOf("o"); // the first o that is occurred in the string
        System.out.println("n1 = " + n1);

      int n2=str.indexOf("ool");
        System.out.println("n2 = " + n2);

        String str1="Java Programming Language";
      int n3= str1.indexOf("a");
        System.out.println("n3 = " + n3);

      int n4=str.indexOf("amm");
        System.out.println("n4 = " + n4);
      int n5= str1.lastIndexOf("g");
        System.out.println("n5 = " + n5);
        System.out.println("---------------------");
        String s= "Java Nova Cava Wawa orange";

        int firstA=s.indexOf("a");
        System.out.println("firstA = " + firstA);
        int lastA=s.lastIndexOf("a");
        System.out.println("lastA = " + lastA);
        int secondA=s.indexOf("a "); // putting space in order to make the char unique.
        System.out.println("secondA = " + secondA);
        int thirdA=s.indexOf("a C");
        System.out.println("thirdA = " + thirdA);
        int fourthA=s.indexOf("Ca")+1;   //in order to find the index of the next one use +1                 // int fourthA= s.indexOf("ava W");
        System.out.println("fourthA = " + fourthA);
        int fourthA2=s.lastIndexOf("av");
        System.out.println("fourthA2 = " + fourthA2);


    }
}
