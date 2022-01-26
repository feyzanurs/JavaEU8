package day08_LogicalOperators_SingleIfStatement;

public class Single_IF_Statements {
    public static void main(String[] args) {
    /*
    Single if Statement is used when there is only one outcome.
     */
        int number=101;

        boolean evenNumber= number%2==0, oddNumber=number%2!=0;


        if (evenNumber) { //even numbers
            System.out.println(number+" is even number");
        }
        if(oddNumber){ //not even number
            System.out.println(number+" is odd number");
        }


        int n=200;
        //positive
        if (n > 0) {
            System.out.println(n+" is positive");
        }
        //negative
        if(n<0){
            System.out.println(n+" is negative");
        }
        //zero
        if(n==0){
            System.out.println(n+ " is equal to zero");
        }
    }
}
