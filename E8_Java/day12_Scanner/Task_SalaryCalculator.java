package day12_Scanner;

import java.util.Scanner;

public class Task_SalaryCalculator {
    public static void main(String[] args) {
        /*SalaryCalculator:
            3.1 Ask the user to enter his/her hourlyRate
            3.2 Ask the user how many hours he/she works in a week
            3.3 Ask the user to enter state tax (in percentage)
            3.4 Ask the user to enter federal tax (in percentage)
            3.5 Calculate the:
                    3.4.1 salary
                    3.4.2 stateTax
                    3.4.3 federalTax
                    3.4.4 totalTax
                    3.4.5 netIncome
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter your hourly Rate");
        double hourlyRate= input.nextDouble();
        System.out.println("Please Enter the weekly working hours");
        int weeklyHours= input.nextInt();
        System.out.println("Please enter the state tax in percentage");
        double stateTax= input.nextDouble();
        System.out.println("Please enter the federal tax in percentage");
        double federalTax=input.nextInt();

        int salaryBeforeTax = (int) (hourlyRate*weeklyHours*52);
        stateTax = salaryBeforeTax*stateTax/100;
        federalTax= salaryBeforeTax*federalTax/100;
        double totalTax= stateTax+federalTax;
        double salaryAfterTax=salaryBeforeTax-totalTax;

        System.out.println("Gross pay is: $"+salaryBeforeTax);
        System.out.println("State tax= $"+stateTax);
        System.out.println("Federal tax= $"+federalTax);
        System.out.println("Total tax= $"+totalTax);
        System.out.println("Net Income= $"+salaryAfterTax);

    }
}
