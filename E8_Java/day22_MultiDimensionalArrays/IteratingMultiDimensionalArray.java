package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
        // index num of array  0          1         3
        int[][] arr2D ={ {1,2,3},{4,5,6,7},{8,9,10,11,12}}; // length of multidimensional array is 3
        //index of elements 0,1,2  0,1,2,3   0, 1, 2, 3, 4

        for (int i=0; i<arr2D.length;i++) { // i: index num of single dimensional array
          //  System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {// j: index number of elements
                System.out.println(arr2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
