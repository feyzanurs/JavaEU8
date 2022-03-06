package day19_StringLoopPractice;

public class LoopsWithoutCurlyBraces {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) // without curly braces only first statement repeated 5 times
            System.out.println("Cydeo"); // 5
            System.out.println("Batch 25"); //1
        for (int i = 0; i < 5; i++) { // with curly braces prints both statement 5times
            System.out.println("cydeo school");
            System.out.println("batch eu8");
        }
    }
}
