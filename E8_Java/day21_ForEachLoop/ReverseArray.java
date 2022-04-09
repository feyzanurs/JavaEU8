package day21_ForEachLoop;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers={10,20,30,40};
        //
        int[] reversed= new int[numbers.length];// make sure that array has enough capacity

     /*         j       i
        reversed[0]=numbers[numbers.length-1];
        reversed[1]=numbers[2];
        reversed[2]=numbers[1];
        reversed[3]=numbers[0];
      */
        for (int i = numbers.length - 1, j=0; i >= 0; i--,j++) { //numbers.forr >> reverse for loop short-cut

        }

        System.out.println(Arrays.toString(reversed));

    }
}
