package day09_If_IfElse_MultiBranch;

public class Task_Calculator {
    public static void main(String[] args) {
        double n1=54, n2=66;
        char mathOperator='*';
        if(mathOperator=='+'){
            System.out.println(n1+n2);
        }else if(mathOperator=='-'){
            System.out.println(n1-n2);
        } else if(mathOperator=='*'){
            System.out.println(n1*n2);
        }else if(mathOperator=='/'){
            System.out.println(n1/n2);
        }else{
            System.out.println("Invalid operator");
        }


    }
}
