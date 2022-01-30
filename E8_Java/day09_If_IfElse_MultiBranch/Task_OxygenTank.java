package day09_If_IfElse_MultiBranch;
import java.util.*;
public class Task_OxygenTank {
    public static void main(String[] args) {
        /*Create a class called OxygenTank. You are diving in the ocean.
        Your oxygen tank has a certain level (number) and you must print a message based on the level:
        Above 90 -  Your tank is full
        Above 80 -  Still okay
        Above 70 -  Don't go too far
        Above 60 -  Start to head back
        Above 50 -  Be careful now you at 50%
        USE ONE PRINT STATEMENT ONLY */

        Scanner s = new Scanner(System.in);
        System.out.println("Oxygen level in the tank:");
        int num = s.nextInt();
        String message="Error";
        if (num>90){ message="Your tank is full";
        }else if (num>80){message="Still okay";
        }else if (num>70){message="Don't go far";
        }else if (num>60){message="Start to head back";
        }else if (num>50){message="Be careful, now you at 50%";
        }
        System.out.println(message);
    }
}
