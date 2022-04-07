package day21_ForEachLoop;

import java.lang.reflect.Array;
import java.util.Arrays;

public class copyOf_method {
    public static void main(String[] args) {
        String[] students={"Elif", "Daniel", "Sinem", "Gunay", "David", "James", "Lea", "Ellie", "Aaron", "Miha"};
        String[] earlyBirds= Arrays.copyOf(students,5);
        System.out.println("earlyBirds = " + Arrays.toString(earlyBirds));

        int[] numbers={ 1,2,3,4,5,6,7,8,9};
        numbers=Arrays.copyOf(numbers,5);
        System.out.println(Arrays.toString(numbers));

        char[] ch1={'A','B', 'C', 'D', 'E', 'F', 'G', 'H', 'I',};
        char[] ch2= Arrays.copyOfRange(ch1,2,6+1);//includes index 6 by adding+1
        System.out.println(Arrays.toString(ch2));

        int[] scores= { 10,20,30,40,50,60,70,80,90};
        int[] result= Arrays.copyOfRange(scores,3,7);
        System.out.println(Arrays.toString(result));
        int[] result2= Arrays.copyOfRange(scores,3,scores.length); // until the last index of the array
        System.out.println(Arrays.toString(result2));


    }
        }
