package day20_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many number would you like to enter?");
        int length= scan.nextInt(); // 5 >> indicates length of array

        if (length<=0){
            System.err.println("Invalid entry");
            System.exit(0);
        }
        int []numbers=new int[length]; // [0, 0, 0, 0, 0] >> length of array should be same with the first one.
                        // if the new int [10]>> only 10 array can be stored which will cause the logical error.
        for (int i = 0; i<length; i++) {
            System.out.println("Enter a Number");
            numbers[i]=scan.nextInt();// enter numbers of the array declared in the first question
            // each input provided during each execution of the loop, will be assigned to index of the array.

        }
        System.out.println(Arrays.toString(numbers));
        scan.close();
    }
}
