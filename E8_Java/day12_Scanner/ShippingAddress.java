package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your full name:");
        String fullName= input.nextLine();
        System.out.println("Enter your building no");
        int buildingNo= input.nextInt();
        input.nextLine();
        System.out.println("Enter your street name:");
        String street= input.nextLine();
        System.out.println("Enter your City name:");
        String city= input.nextLine();
        System.out.println("Enter your State:");
        String state=input.nextLine();
        System.out.println("Enter your zip code");
        int zipCode=input.nextInt();
        System.out.println("Shipping Address:");
        System.out.println("Full Name = " + fullName);
        System.out.println("street = " + street);
        System.out.println("buildingNo = " + buildingNo);
        System.out.println("city = " + city);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
    }
}
