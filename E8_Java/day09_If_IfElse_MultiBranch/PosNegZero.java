package day09_If_IfElse_MultiBranch;

public class PosNegZero {
    public static void main(String[] args) {
        int n=100;

        if(n>0) {
            System.out.println("POSITIVE");
        }else if(n<0){
            System.out.println("NEGATIVE");
        }else{
            System.out.println("ZERO");
        }
    }
}
