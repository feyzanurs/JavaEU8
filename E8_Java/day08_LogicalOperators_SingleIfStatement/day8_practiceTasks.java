package day08_LogicalOperators_SingleIfStatement;

public class day8_practiceTasks {
    public static void main(String[] args) {
        byte age= 25;

        if(age>=18){
            System.out.println("Person is eligible to buy cigarettes");
        }
        byte gradeLevel=7;
        if(gradeLevel>=1&&gradeLevel<=5){
            System.out.println("Elementary School");
        }
        if (gradeLevel>=6&&gradeLevel<=8){
            System.out.println("Middle School");
        }
        if(gradeLevel>=9&&gradeLevel<=12){
            System.out.println("High School");
        }
        if(gradeLevel>=13&&gradeLevel<=16){
            System.out.println("Collage");
        }if(gradeLevel>=17&&gradeLevel<=18){
            System.out.println("Grad School");
        }
        int num=5346, num2=5636;
        if(num>num2){
            System.out.println(num+" is maximum number");
        }
        if(num2>num){
            System.out.println(num2+" is maximum number");
        }
        if(num==num2){
            System.out.println("Equals");
        }
    }
}
