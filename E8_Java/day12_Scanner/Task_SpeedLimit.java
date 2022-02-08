package day12_Scanner;

import java.util.Scanner;

public class Task_SpeedLimit {
    public static void main(String[] args) {
        /*
        2. Write a program for the speed check. a variable named speedLimit is given and assigned, ask user to enter the current speed, if the current speed is over the speedLimit print slow down, otherwise do not print anything
        Ex:
            speedLimit = 55;
            Enter current speed:
            105
            output:
            You're driving 50 mph over the limit. Slow down!
         */
        Scanner input=new Scanner(System.in);
        System.out.println("Enter current speed");
        int speed= input.nextInt();
        int speedLimit=55;
        int currentSpeed= speed - speedLimit;

        if (speed>55){
            System.out.println("You're driving "+currentSpeed+" mph over the limit. Slow down!");
        }else{
            System.out.println("You are safe!");
        }
    }
}
