package day04_Variables;

public class Currencies {
    public static void main(String[] args) {
        double euro=100;
        double convertToWon= euro*1357.84;
        double convertToLira= euro*15.42;

        System.out.println(euro+" = " + convertToWon + " Won");
        System.out.println(euro+" = " + convertToLira+ " Lira");

    }
}
