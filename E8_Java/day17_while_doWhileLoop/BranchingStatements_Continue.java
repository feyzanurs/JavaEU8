package day17_while_doWhileLoop;

public class BranchingStatements_Continue {
    public static void main(String[] args) {
        for (char i = 'A'; i <='E' ; i++) {
            if (i == 'C') {
                continue; // skips the loop
            }
            System.out.print(i + " ");
        }
        System.out.println("\n-------even numbers-------------------");
        // print all even numbers 1-10
        for (int i = 1; i <=10 ; i++) {
            if (!(i%2==0)) {
                continue;
            }
            System.out.print(i+" ");
        }
        System.out.println("\n------odd numbers------------------");
        // print all odd numbers 1-10
        for (int i = 1; i <=10 ; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}


