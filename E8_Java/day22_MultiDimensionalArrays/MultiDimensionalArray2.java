package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray2 {
    public static void main(String[] args) {


        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        //3 dimensional Array contains 2d Array

        // index num 1d array     0       1        2                 0             1          2
        int[][][] arr3D = {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}};
        // index num 2D arr=                  0                        1

        //[index of 2dArray] [index of 1D array] [index of elements]
        System.out.println(Arrays.deepToString(arr3D));

        //{{10, 20, 30}, {40, 50, 60}, {70, 80, 90}}
        System.out.println(Arrays.deepToString(arr3D[1]));

        //{40, 50, 60}

        System.out.println(Arrays.toString(arr3D[1][1]));

        //9
        System.out.println(arr3D[0][2][2]);

        // each element >> for each loop
        for (int[][] each2D:arr3D) {
            for (int[] each1D:each2D) {
                for (int element:each1D) {
                    System.out.println(element);
                }
            }
        }
    }
}

