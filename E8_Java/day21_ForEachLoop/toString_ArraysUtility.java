package day21_ForEachLoop;

import java.util.Arrays;

public class toString_ArraysUtility {
    public static void main(String[] args) {
        int [] numbers={1,2,3,4,5};
        System.out.println(numbers); // if you print without Arrays Utility >> [I@3f0ee7cb
        System.out.println(Arrays.toString(numbers)); // prints the array itself

        System.out.println(numbers[0]); // it's an element not array, so no need to call toString method
    }
}
