package day12_Scanner;

import java.util.Scanner;

public class Task_GradeReport {

    public static void main(String[] args) {
        /*
            2. GradeReport:
            2.1 Ask the user to enter the his/her score
            2.2 Print the grade of the student (A, B, C, D, F)
            2.3 If user enter invalid score (negative or more than 100) print invalid score
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your score");
        int score= scan.nextInt();
         if(score<0 && score>100){
             System.out.println("Invalid Score");
         }else if (score>=90){
             System.out.println("Your score is A");
         }else if (score>=80 && score<=89){
             System.out.println("Your score is B");
         }else if (score>=70 && score<=79){
             System.out.println("Your Score is C");
         }else if (score>=60 && score<=69){
             System.out.println("Your Score is D");
         }else if (score>=0 && score<=59){
             System.out.println("Your Score is F");
         }
    }
}
