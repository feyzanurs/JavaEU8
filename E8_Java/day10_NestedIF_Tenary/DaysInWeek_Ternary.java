package day10_NestedIF_Tenary;

public class DaysInWeek_Ternary {
    public static void main(String[] args) {
        int n = 5; // 1-7
        if (n == 1) {
            System.out.println("MONDAY");
        } else if (n == 2) {
            System.out.println("TUESDAY");
        } else if (n == 3) {
            System.out.println("WEDNESDAY");
        } else if (n == 4) {
            System.out.println("THURSDAY");
        } else if (n==5) {
            System.out.println("FRIDAY");
        } else if (n==6){
            System.out.println("SATURDAY");
        }else {
            System.out.println("SUNDAY");
        }
        System.out.println("------------------------------");
        /*
        if=> (condition)?
        else=> :
        else if=> :(condition)?
         */
       String result= (n==1)?"MONDAY":(n==2)?"TUESDAY":(n==3)?"WEDNESDAY":(n==4)?"THURSDAY"
               :(n==5)?"FRIDAY":(n==6)?"SATURDAY":"SUNDAY";
    }
}
