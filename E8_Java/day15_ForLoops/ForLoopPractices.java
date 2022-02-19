package day15_ForLoops;

public class ForLoopPractices {
    public static void main(String[] args) {
        //15 16 17 18 19 ....
        for (int i=15; i<=45; i++){
            System.out.print(i+ " ");
        }

        System.out.println("");
        for (int i=100; i>=50; i--){
            System.out.print(i+" ");
        }
        System.out.println("\n");

        for (int i=2; i<=55; i+=2){ // prints even numbers
        System.out.print(i+" ");

        }
    }
}
