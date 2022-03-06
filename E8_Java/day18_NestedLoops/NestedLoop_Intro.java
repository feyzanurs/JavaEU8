package day18_NestedLoops;

public class NestedLoop_Intro {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }

        System.out.println("-----------------------------");
        for (int j = 0; j <4 ; j++) { //j: 0,1,2,3
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");
            }
        }
    }

}
