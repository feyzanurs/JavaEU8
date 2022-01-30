package day09_If_IfElse_MultiBranch;
import java.util.*;
public class Task_FINRA {
    public static void main(String[] args) {
        /*
        Create a class called FINRA, Write a function which prints out the number.
        but for number which is a multiple of 3, print "FIN" instead of the number and for number
        which is a multiple of 5, print "RA" instead of the number. and for number which is a multiple of both 3
        and 5, print "FINRA" instead of the number.
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the number to print:");
        int num = s.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("FINRA");
        }else if (num%5==0){
            System.out.println("RA");
        }else if (num%3==0){
            System.out.println("FIN");
        }
    }
}
