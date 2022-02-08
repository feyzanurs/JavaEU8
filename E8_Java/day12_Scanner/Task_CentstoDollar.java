package day12_Scanner;

import java.util.Scanner;

public class Task_CentstoDollar {
    public static void main(String[] args) {
        /*
        3. Write a program that can convert cents to dollars, if there is any remainder include them in the result as cents
            Ex:
                Enter cents
                225
                output:
                225 cents equal to: 2 dollars and 25 cents
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter cents:");
        int cent= input.nextInt();

        int centTodollar= cent/100;
        int remainingCents= cent%100;
        System.out.println(cent+" equals to: "+centTodollar+" dollars and "+remainingCents+" cents.");

    }
}
