package day10_NestedIF_Tenary;

public class Task_SalaryCalculator {
    public static void main(String[] args) {
        double salary=75_000;
        boolean married=true;
        double taxRate=0;
        if (salary>=130000) {
            taxRate = 0.35;
        }else if (salary>=100000) {
            taxRate = 0.30;
        }else if (salary>=80000){
            taxRate=0.25;
        }else {
            taxRate = 0.20;
        }
        if (married){
            taxRate=0.05;
        }
        double salaryAfterTax=salary-(salary*taxRate);
        System.out.println("Salary after Tax= "+ salaryAfterTax);
    }
}
