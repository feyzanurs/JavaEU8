package day21_ForEachLoop;

import java.util.Arrays;

public class sort_method {
    public static void main(String[] args) {
        int[] scores = {95, 100, 55, 76, 88, 92};
        System.out.println(Arrays.toString(scores)); // not sorted
        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));// after sorting

        System.out.println("Min Score: " + scores[0]);
        System.out.println("Max Score: " + scores[scores.length - 1]);

        String[] names = {"Anna", "Jaka", "John", "Hailey", "Sam", "Maria", "Adam", "Lea", "Lina", "Nika"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] words={"Anna","ANNA"}; // Upper case will be printed first due to order in the ASCII table
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));
    }
}
