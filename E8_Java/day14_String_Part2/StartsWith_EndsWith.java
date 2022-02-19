package day14_String_Part2;

public class StartsWith_EndsWith {
    public static void main(String[] args) {
        String a= "Wooden Spoon";
        boolean x= a.startsWith("Woo");
        boolean y= a.endsWith("Spoon");
        boolean z= a.toLowerCase().startsWith("wooden");
        //in order to ignore case sensitivity, first call upperCase/lowerCase method,then call the method starts/endsWith
        System.out.println(x);
    }
}
