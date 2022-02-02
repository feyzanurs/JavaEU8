package day10_NestedIF_Tenary;

public class TernariesIntro {
    public static void main(String[] args) {
        int n=100;
        if (n%2==0){
            System.out.println("Even");// String
        }else{
            System.out.println("Odd");// String
        }                              // both of the blocks returning the same type of value which is  String
        //IN TERNARY YOU MUST RETURN A VALUE!!!!!
        System.out.println("----------------------");

        String result= (n%2==0)?"Even":"Odd"; // Exactly the same statement above written with if

        System.out.println(result);
        System.out.println("-----------------------");
        int age=23;
        if (age>=21){
            System.out.println("Eligible");// the data type if printing is String
        }else{
            System.out.println("Not Eligible");
            System.out.println("--------------------");
            // the data type else printing is String as well.
        } // every single block (if block and else block) returns to one value (String)
            // if both of the conditions are met, we can apply ternary as follows;
        /*
            if = ?
            condition placed before ?
            "Eligible" as a String value >> you must return after ?
            else= :
            "Not Eligible"= second value must return after :
            At the very first beginning initialize the value which will be returned (i.e.String)

         */           //  RESULT
                String result1= (age>=21)?"Eligible":"Not Eligible";
                System.out.println(result1);
        System.out.println("-------------------------------------");

         int number=100;
        if (number>0){
            System.out.println("Positive");
        }else if (number<0){
            System.out.println("Negative");
        }else{
            System.out.println("Equals to Zero");
        }
        System.out.println("Ternary version");
        System.out.println("String result2=(number>0)?\"Positive\":(number<0)?\"Negative\":\"Equals to Zero\";");

        String result2=(number>0)?"Positive":(number<0)?"Negative":"Equals to Zero";

        System.out.println(result2);
    }
}
