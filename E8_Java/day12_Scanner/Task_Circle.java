package day12_Scanner;
import java.util.Scanner;
public class Task_Circle {
    public static void main(String[] args) {
        /*
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Enter the radius of the Circle");
        double radius= input.nextDouble();
        double pi=3.14;
        double perimeter= 2*radius*pi;
        double area=radius*radius*pi;
        System.out.println("Perimeter of the circle is: "+perimeter+"\nArea of the Circle is: "+area);
    }
}
