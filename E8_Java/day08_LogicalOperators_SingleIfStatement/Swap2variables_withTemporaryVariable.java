package day08_LogicalOperators_SingleIfStatement;

public class Swap2variables_withTemporaryVariable {
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println("a = " + a); //10
        System.out.println("b = " + b); //15
        //-----------------------------------
        int c=b; //c=15
        b=a; // b=10
        a=c; //a

    }
}
