package day09_If_IfElse_MultiBranch;

public class MinNumber {
    public static void main(String[] args) {
        int n1=100,n2=200;
        boolean min= n1<n2;
        boolean max=n1>n2;
        boolean equals= n1==n2;


        if(min) {
            System.out.println(n1 + " is min");
        }
        if(max){
            System.out.println(n1+ " is max");
        }
        if (equals){
            System.out.println(n1+" equals to "+ n2);
        }
    }
}
