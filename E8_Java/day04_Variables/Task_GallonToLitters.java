package day04_Variables;

public class Task_GallonToLitters {
    public static void main(String[] args) {
        //1 gallon = 3.79 litters
        int gallon= 20;
        double litter=3.79;
        double convertToLiter= gallon*litter;
        System.out.println("gallon = " + gallon);
        System.out.println("litter = " + litter);
        System.out.println(gallon+ " gallon= "+ convertToLiter+" liters");
    }
}
