package day07_Operators_UnaryShorthandRelational;

public class RelationalOperators {
    public static void main(String[] args) {
        // >, >=, <, <=

        boolean result1=20>40; // false
        System.out.println("result1 = " + result1);

        boolean result2= 300>=150;// true
        System.out.println("result2 = " + result2);

        boolean result3=100>=100; // true
        System.out.println("result3 = " + result3);

        boolean result4=300>=500; //false
        System.out.println("result4 = " + result4);

        //credit score of 720
        int score= 745;
        boolean eligible= score>=720;
        System.out.println("eligible = " + eligible);

        boolean result5= 100<120; //false
        System.out.println("result5 = " + result5);

        boolean

    }
}
