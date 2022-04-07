package day21_ForEachLoop;
/*
 - Easier than other type of Loops.
 - No way to get an infinite loop, no iteration.
 - How many times it will be executed depends on the data structure.
 - Used to access each successive value of a data structure
 - There MUST be a data structure (Array, Collection, or Map) to use for each loop
 - Only can be used if you have access from first element to last element
 - Iteration times and orders are fixed
 - Does not have any index numbers

 Syntax: for(dataType variableName : dataStructure){
    //Statement}
!!! data type MUST match with the successive values of the data structure
ex: int[] numbers={3,6,9};
    for(int each : numbers){
        System.out.println(each);
        }
 */

public class FoEach_Loop {
    public static void main(String[] args) {
        int[] numbers={10, 20, 30, 40, 50, 60, 70, 80, 90};
        for (int i = 0; i < numbers.length; i++) {
            int eachElement= numbers[i];
            System.out.println(eachElement);
        }
        System.out.println("-----------for each loop------------------");
        for (int each: numbers){
            System.out.println(each);

        }

    }
}
