package day12_Scanner;
import java.util.Scanner;
public class Scanner_intro {
    public static void main(String[] args) {
        /*
        - Provides the method to get inputs
        - Presented in java.util package
        - Need to be imported to your program

        import java.util.Scanner
           |        |       |
        keyword   package  Class

        - Must be initiated before it can be used
        -The parameter is System.in passed to Scanner's constructor to connect the scanner to the keyboard

            Scanner.keyboard = new Scanner (System.in);
                   |                       |
          This declares a variable       This creates a Scanner object
          named keyboard. The            in memory. The object will read input
          variable can reference         from System.in
          an object of ScannerClass
                            **********SCANNER METHODS**************
               next() >> Returns input as a String, reads the input only until a space
               nextLine() >> Return input as String, reads the entire input until the newLine(pressEnter)
               nextByte(), nextShort(), nextInt(), nextLong(), nextFloat(), nextBoolean()
         */

        Scanner input = new Scanner (System.in);
        System.out.println("Enter an integer:");
        int num= input.nextInt();
        // System.out.println(input.nextInt()); // not the same data as previous line.
        System.out.println("Enter a decimal");
        double num1=input.nextDouble();
        System.out.println(num);
        System.out.println(num1);
        System.out.println("Multiplication: "+(num*num1));
        input.close();//closes the scanner, after closure, you cannot use scanner anymore



    }
}
