package day09_If_IfElse_MultiBranch;
import java.util.*;
public class Task_CampusTime {
    public static void main(String[] args) {
        /*
        Create a class called CampusTime, an integer variable named time is given with a number between 1~24 has been
        initialized, write a program that can find out if the campus is open or not.
        Campus is open from 8 am(8) to 11 pm (23) If user enters a time within the open
        time they should see message: “open”  but if the time entered is outside
        operating hours they should see: “ closed”
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the time:");
        int num = s.nextInt();

        if (num>=8 && num<=23){
            System.out.println("Campus is OPEN");
        }else{
            System.out.println("Campus is CLOSED");
        }
    }
}
