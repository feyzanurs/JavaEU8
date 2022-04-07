package day21_ForEachLoop;

public class MaxNum_forEach {
    public static void main(String[] args) {
        int[] numbers={10, 5, 4, 20, 1, 0};
        int max=numbers[0];

        for (int number : numbers){ // shortcut > variableName.for > enter
            if (number>max){
                max=number;
            }
        }

        System.out.println(max);
    }
}
