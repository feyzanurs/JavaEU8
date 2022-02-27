package day15_ForLoops;

public class PrintA_to_Z {
    public static void main(String[] args) {
        for (char c='A';c<='Z';c++ ) { //int i=65; i<=90 according to ASCII table.
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for (char c='a';c<='z';c++ ) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for (char c='Z';c>='A';c-- ) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for (char c='z';c>='a';c-- ) {
            System.out.print(c + " ");
        }
        System.out.println("\n");
        for (int i=1;i<=5;i++ )
        if(i<=4){
            System.out.print(i + ",");
        }
            else{
            System.out.print(i);
        }
    }

}
