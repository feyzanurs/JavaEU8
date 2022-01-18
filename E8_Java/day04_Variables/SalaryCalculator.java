package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRate=50;
        int weeklyHours=40;
        int numberOfWeeks=52;
        int salary=hourlyRate*weeklyHours*numberOfWeeks;
        System.out.println("Hourly Rate= "+hourlyRate);
        System.out.println("Weekly Hours= "+weeklyHours);
        System.out.println("Salary= $"+salary); //soutv >> short cut to print value


    }
}
