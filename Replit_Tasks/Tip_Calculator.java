import java.util.Objects;
import java.util.Scanner;

public class Tip_Calculator {
    public static void main(String[] args) {
        /*
        Write a program for a tip calculator.
        There will be different service quality benchmarks that will determine the tip given.
        There will also the ability to calculate based on the number of people
        in the party and if there is a split of the bill or not.

            Poor = 5% Fair = 10% Good = 15% Great = 20% Excellent = 25%
            The program should display the following information based on the user input:
            Split or No split (Yes or No)
            Number of people entered: (number) (each person = & in output)
            Check amount: (number)
            Service Quality: (String)
            Total to pay: Total tip: Total per person: Tip per person:
            Ex:
            Input:
            Yes
            4
            476.0
            Excellent
            Output:
            Number of people entered: &&&&
            Total to pay: 595.0
            Total tip: 119.0
            Total per person: 148.75
            Tip per person: 29.75
         */
        String a1, a2, quality, split ;
        double bill, totalTip, TotalPerPerson, TipPerPerson, totalPay;
        int people;
        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        split = input.next();
        a1 = "Yes";
        a2 = "No";
        System.out.println("Number of people:");
        people = input.nextInt();
        String ppl = "";

        System.out.println("Check amount:");
        bill = input.nextDouble();
        input.nextLine();
        System.out.println("Service Quality:");
        quality = input.nextLine();
        boolean a = quality.equals("Excellent") || quality.equals("Great") || quality.equals("Good") ||
                quality.equals("Fair") || quality.equals("Poor");

        //OUTPUT
        if (split.equals(a1)) {
            switch (quality) {
                case "Excellent":
                    System.out.println("Number of people entered: ");
                    totalPay = (bill / 100) * 125;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    TotalPerPerson = totalPay / people;
                    System.out.println("Total per person: " + TotalPerPerson);
                    TipPerPerson = totalTip / people;
                    System.out.println("Tip per person: " + TipPerPerson);
                    break;
                case "Great":
                    System.out.println("Number of people entered: &&&&&" );
                    totalPay = (bill / 100) * 120;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    TotalPerPerson = totalPay / people;
                    System.out.println("Total per person: " + TotalPerPerson);
                    TipPerPerson = totalTip / people;
                    System.out.println("Tip per person: " + TipPerPerson);
                    break;
                case "Good":
                    System.out.println("Number of people entered: &&&&&" );
                    totalPay = (bill / 100) * 115;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    TotalPerPerson = totalPay / people;
                    System.out.println("Total per person: " + TotalPerPerson);
                    TipPerPerson = totalTip / people;
                    System.out.println("Tip per person: " + TipPerPerson);
                    break;
                case "Fair":
                    System.out.println("Number of people entered: &&&&&" );
                    totalPay = (bill / 100) * 110;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    TotalPerPerson = totalPay / people;
                    System.out.println("Total per person: " + TotalPerPerson);
                    TipPerPerson = totalTip / people;
                    System.out.println("Tip per person: " + TipPerPerson);
                    break;
                case "Poor":
                    System.out.println("Number of people entered:" );
                    totalPay = (bill / 100) * 105;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    TotalPerPerson = totalPay / people;
                    System.out.println("Total per person: " + TotalPerPerson);
                    TipPerPerson = totalTip / people;
                    System.out.println("Tip per person: " + TipPerPerson);

            }
        } else if (split.equals(a2)) {
            switch (quality) {
                case "Excellent":
                    totalPay = (bill / 100) * 125;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    break;
                case "Great":
                    totalPay = (bill / 100) * 120;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    break;
                case "Good":
                    totalPay = (bill / 100) * 115;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    break;
                case "Fair":
                    totalPay = (bill / 100) * 110;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    break;
                case "Poor":
                    totalPay = (bill / 100) * 105;
                    System.out.println("Total to pay: " + totalPay);
                    totalTip = totalPay - bill;
                    System.out.println("Total tip: " + totalTip);
                    break;
            }
        }

    }
}