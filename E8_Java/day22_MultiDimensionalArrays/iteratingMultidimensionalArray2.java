package day22_MultiDimensionalArrays;

public class iteratingMultidimensionalArray2 {
    public static void main(String[] args) {
     int[][] arr2D ={ {1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
      for (int i = arr2D.length - 1; i >= 0; i--) { //i: index num of 1 dimensional array starting from last index to 0
          for (int j = 0; j < arr2D[i].length; j++) {// arr2D[i] represents each single dimensional array
                                                        //j: index numb of elements starting from 0 to last index
              System.out.print(arr2D[i][j]+" ");

          }
          System.out.println();
        }
        System.out.println("----------------------------");

        for (int i = 0; i < arr2D.length; i++) {// i: index num of 1D array starting from 0
            for (int j = arr2D[i].length - 1; j >= 0; j--) {// j: index num of each element starting from last index
                System.out.print(arr2D[i][j]+" ");
            }
            System.out.println();
        }

    }
}
