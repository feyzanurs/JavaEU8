package day17_while_doWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        boolean a= false;
        while(a){
            System.out.println("Wooden Spoon -- for loop");
        } // if the boolean condition is not true the statement will never be printed
        System.out.println("-------------------------------------");
        while(a){
            System.out.println("Wooden Spoon -- while loop"); // repeated if statement
        }
        System.out.println("-------------------------------------");
        do { // just do it
            System.out.println("Wooden Spoon");
        }while(a);


    }
}
