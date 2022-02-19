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
        double bill, totalTip, TotalPerPerson, TipPerPerson, tipRate, totalPay;
        int people;
        //INPUT
        Scanner input = new Scanner(System.in);
        System.out.println("Split:");
        split = input.next().toLowerCase();

        System.out.println("Number of people:");
        people = input.nextInt();
        String ppl = "";

        System.out.println("Check amount:");
        bill = input.nextDouble();
        input.nextLine();

        System.out.println("Service Quality:");
        quality = input.nextLine().toLowerCase();

        tipRate= (quality.equals("Excellent"))?0.25: (quality.equals("Great"))?0.2: (quality.equals("Good"))?0.15:
                 (quality.equals("Fair"))?0.1: 0.5;
        totalTip=bill*tipRate;
        System.out.println("Number of People entered: "+people);
        System.out.println("Total pay: "+bill);
        System.out.println("Total tip: "+totalTip);

        TotalPerPerson= bill/people;
        TipPerPerson= totalTip/people;
        //OUTPUT
       if (split.equals("yes")){
           System.out.println("Total per person: "+ TotalPerPerson );
           System.out.println("Total tip per person:"+ TipPerPerson);
       }

    }
}