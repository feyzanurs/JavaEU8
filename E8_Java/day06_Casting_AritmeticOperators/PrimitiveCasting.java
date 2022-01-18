package day06_Casting_AritmeticOperators;

public class PrimitiveCasting {
    public static void main(String[] args) {
        byte a=100;
        short b=a; //(short)a
        // implicit casting done by compiler >>
        int c=b; //(int)b
        // smaller data type to bigger data type >>
        //Widening
        //No loss of data
        long d=c; //(long)c
        float e=d;
        double f=e;
        System.out.println("------------------------");
        int x=55;
        short y=(short)x; //explicit casting
        System.out.println(x+":"+y);

        long j=100000;
        short k=(short)j;
        System.out.println(j+":"+k);

        double l=2.5;
        float m= (float)l;
        System.out.println(l+":"+m);

        double n=10.8;
        int s= (int) (long) n; //  Possible first cast to int then long.
        System.out.println(n+": "+ s);
        /*EXPLICIT CASTING
        -Done by programmer manually
        -Bigger data type to smaller data type
        -Narrowing
        Loss of data
         */
        double d1=20.5;
        short s1= (short) d1;// short-cut >> option+enter

    }

}
