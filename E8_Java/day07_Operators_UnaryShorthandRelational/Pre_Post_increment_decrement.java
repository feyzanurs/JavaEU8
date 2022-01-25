package day07_Operators_UnaryShorthandRelational;

public class Pre_Post_increment_decrement {
    public static void main(String[] args) {
        /*
        Pre-Increment/Decrement
       ---------------------------
      >> Increment/Decrement operators sre placed before the operand
      >> Increase/decrease the value by 1 in the memory. (immediately)
         */
        int a=25;
        System.out.println(++a);// 26
        System.out.println(--a);// 26>>25
        System.out.println("------------------------------------------");
        /*
        Post-Increment/Decrement
       ----------------------------
       >> Increment/Decrement operators are placed after the operand
       >> Old value of the variable will be used first before increase/decrease the value by 1 in the memory.
       >> FIRST USE THE NUMBER THEN INCREASE/DECREASE IN THE MEMORY!(Number in the memory never printed, just stored.)
       >> next line always continues with the number increased or decreased number in the memory!!
        */
        int b=16;
        System.out.println(b++);// 16(prints)>>17(memory-not printed)
        System.out.println(b--);//17(prints,latest number in the memory)>>16(decreased in memory, not printed)

        int z=45;
        System.out.println(++z);// 45>>46(prints)
        System.out.println(z++);//46(prints)>>47(no print)
        System.out.println(z);//47 (the latest value in the memory)
        System.out.println("----------------------------------------");

        int q=30;
        System.out.println(--q); //30>>29(prints)
        System.out.println(q--); //29(prints)>>28(no print)
        System.out.println(q);//28(latest value in the memory)

    }
}
