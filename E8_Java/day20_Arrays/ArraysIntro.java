package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro { // A container which contains all the data
    public static void main(String[] args) {
        // create a variable that is capable enough to contain 5 names
        String [] myGroup = new String[5]; //0 - 4
        myGroup[0]="Gunay";
        myGroup[1]="Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        System.out.println(myGroup); // to string method [Ljava.lang.String;@3f0ee7cb >>gives hashcode
        // String code is not executed, not called >> wrong way to call array (without utility class and toString method
        System.out.println(Arrays.toString(myGroup)); //[null, null, null, null, null] default value

        System.out.println("----------------------------------");
        String[] days={"Monday", "Tuesday","Wednesday","Thursday", "Friday", "Saturday", "Sunday"};
        System.out.println(Arrays.toString(days));

        int number=6;
        if(number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);
    }
}
