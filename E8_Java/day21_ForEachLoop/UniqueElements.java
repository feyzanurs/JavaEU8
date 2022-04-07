package day21_ForEachLoop;

import javax.swing.plaf.IconUIResource;

public class UniqueElements {
    public static void main(String[] args) {
        String [] words={"Layan", "Layan", "Oleksandr", "Olga", "Adam", "Adam", "Cydeo", "Lea", "Cydeo", "Hello"};

        for (String each : words) {
            int count=0;
            for (String element : words) {
                if (element.equals(each)) {
                    count++;

                }
            }
            if (count==1){
                System.out.println(each);
            }
        }







    }
}
