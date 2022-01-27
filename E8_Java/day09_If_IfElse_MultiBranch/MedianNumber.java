package day09_If_IfElse_MultiBranch;

public class MedianNumber {
    public static void main(String[] args) {
        int a=10738, b=1735, c=14760;

        boolean median= a<b && b<c;


        if(median){
            System.out.println(b+ " is the median number");
        }
        //a is median a=15, b=10,c=20
        boolean aisMedian= (a>b && a<c) || (a>c && a<b);
        //b is median b=15, a=20, c =10;
        boolean bisMedian= (b>c && b>a)|| (b>a && b<c);
        //c is median
        boolean cisMedian=!aisMedian && !bisMedian;

        if(aisMedian){
            System.out.println(a+ " is the median number");
        }
        if (bisMedian){
            System.out.println(b+ " is the median number");
        }
        if (cisMedian){
            System.out.println(c+ " is the median number");
        }
    }
}
