package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethod_toCharArray { //Converts this string to a new character array.
    public static void main(String[] args) {
        String str="Java";
        char[] chars =str.toCharArray();
        System.out.println(Arrays.toString(chars)); // [J, a, v, a]

        for (char each:str.toCharArray()){
            System.out.println(each);
        }

    }
}
