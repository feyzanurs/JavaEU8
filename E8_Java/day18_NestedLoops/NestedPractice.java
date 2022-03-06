package day18_NestedLoops;

import java.util.Scanner;

public class NestedPractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(true){
            System.out.println("Please enter your age:");
            int age= scan.nextInt();

            while(! (age>-1 && age<=120)){
                System.err.println("Invalid entry, please enter again");
            }
            System.out.println("Would you like to continue? yes/no");
            String a= scan.next().toLowerCase();
            while(!(a.equals("yes")|| a.equals("no"))){
                System.err.println("Invalid entry, please enter again\nWould you like to continue? yes/no");
                a= scan.next().toLowerCase();
            }
            if (a.equals("no")){
                break;
            }
        }
        scan.close();

    }
}
