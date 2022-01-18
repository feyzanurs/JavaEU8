package day04_Variables;

public class Task_Circle {
    public static void main(String[] args) {
        double pi=3.14;
        double radius=3.5;
        double diameter= 2*radius;
        double area=radius*radius*pi;
        double perimeter= diameter*pi;
        System.out.println("radius = " + radius);
        System.out.println("pi = " + pi);
        System.out.println("diameter = " + diameter);
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);
    }
}
