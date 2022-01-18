package day06_Casting_AritmeticOperators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1);// 121 >> concatenation
        System.out.println(10 + 20);// 30 >> Addition
        System.out.println(100 - 50);//50 >> Subtraction
        System.out.println(10 * 6);//60 >> Multiplication
        System.out.println(10 / 4);//2 , not 2.5 >> Division works differently because 10 and 4 are integer numbers
        System.out.println(10.0/4);//2.5 >> if you want decimal outcome, one of the numerators has to be double type.
        System.out.println(10%7);// 3 >> Remainder gives you the result of remaining amount of the division

        int a=100;
        double b=a/6;//16.0
        //double b=16;
        System.out.println(b);
        double c=(double)a/6; //if you want exact decimal result
        System.out.println(c);

        System.out.println(100D);/* adding upper D to end of the number, it prints out as 10.0
                                 converts integer to double */







    }
}