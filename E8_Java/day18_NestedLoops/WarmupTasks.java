package day18_NestedLoops;

public class WarmupTasks {
    public static void main(String[] args) {
        int a=20, b=6; // 20/6=3 remainder is 2
                        // a-=b >> a=14,  a-=b >> a=8,   a-=b >> a=2,
        int count=0;
        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with the remainder of "+a);
    }
}
/*
 1.  Write a program that can divide two positive numbers without using /
  (division) and * (multiplication) and % operators

 */