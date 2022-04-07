package day21_ForEachLoop;

import java.util.Arrays;

public class equals_method {
    public static void main(String[] args) {
//provide two arguments equals(array1,array2)
    int[] arr1={ 1,2,3};
    int[] arr2={1,2,3};
  //  Arrays.equals(arr1,arr2);
        boolean r1=Arrays.equals(arr1,arr2);
        System.out.println(r1);
     Arrays.sort(arr1);
     Arrays.sort(arr2);

        boolean r2=Arrays.equals(arr1,arr2);
        System.out.println(r2);

        char[] ch1={'a', 'c', 'b'};
        char[] ch2={'b', 'a', 'c'};

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        boolean anagram= Arrays.equals(ch1, ch2);
        System.out.println("anagram = " + anagram);
    }
}
