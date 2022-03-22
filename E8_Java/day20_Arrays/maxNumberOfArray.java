package day20_Arrays;

public class maxNumberOfArray {
    public static void main(String[] args) {
        int[] numbers={10,5,4,20,1,0};
        int max= numbers [0];// 10

    //    for (int i = numbers.length - 1; i >= 0; i--) { //numbers.forr >> short-cut to create Array for loop (reverse)
            for (int i = 0; i < numbers.length; i++) { // numbers.fori >> calls for loop for  the Array
                if (numbers[i]>max) {// if there is element in the array that is greater than the current max number
                    max = numbers[i]; // assigning greater number to variable max

                }
            }
        System.out.println(max);
    }
}
