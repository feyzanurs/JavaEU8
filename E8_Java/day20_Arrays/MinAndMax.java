package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        int[] numbers=new int[10];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number");// will be repeated 10 times
           numbers[i]= scan.nextInt(); // each user entered input will be assigned to the index of  the array numbers
        }
        // finding max and min number use the loop below
        int max=numbers[0];
        int min=numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
     System.out.println("numbers = " + Arrays.toString(numbers));  // prints the array
     System.out.println("max = " + max);
     System.out.println("min = " + min);
    }

}
