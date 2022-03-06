package day17_while_doWhileLoop;

public class LoopPractices {
    public static void main(String[] args) {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(i);
        }
        System.out.println("-------------------------");
        int j=1;
        while (j<=10){
            System.out.println(j);
            j++; // if you place before statement it will give a logical error because it will start printing from 2
        }
        System.out.println("-------------------------");
        int k=1;
        do {
            System.out.println(k);
            k++; // iteration always after statement in order to avoid logical error
        }while(k<=10);
    }
}
