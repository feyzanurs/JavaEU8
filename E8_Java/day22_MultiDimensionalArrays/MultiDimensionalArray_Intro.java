package day22_MultiDimensionalArrays;

import java.util.Arrays;

public class MultiDimensionalArray_Intro {
    public static void main(String[] args) {
        String[]group1={"John", "Joe", "James"};
        String[] group2={"Lea", "Ellie", "Lilla"};
        String[] group3={"Max", "Mike", "Miha"};

        String[][] groups=new String[3][]; // index> 0,1,2
        groups[0]= group1;
        groups[1]=group2;
        groups[2] =group3;
       // System.out.println(Arrays.toString(groups));// toString() is only for one dimensional arrays
        System.out.println(Arrays.deepToString(groups));
        System.out.println("--------------------------------------");

    // index num of array  0          1         3
        int[][] arr2D ={ {1,2,3},{4,5,6,7},{8,9,10,11,12}}; // length of multidimensional array is 3
       //index of elements 0,1,2  0,1,2,3   0, 1, 2, 3, 4

        System.out.println(Arrays.toString(arr2D[1]));// for single dimensional array

        System.out.println(arr2D[2][3]);// to get index number as 11
    }
}
