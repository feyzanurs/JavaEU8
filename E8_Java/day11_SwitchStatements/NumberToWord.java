package day11_SwitchStatements;

public class NumberToWord {
    public static void main(String[] args) {
        int n= 5;
        String Result= (n>=0 && n<=9)?
                 (n==0)?"Zero" :(n==1)?"One":(n==2)?"Two" :(n==3)?"Three"
                :(n==4)?"Four" :(n==5)?"Five" :(n==6)?"Six"
                :(n==7)?"Seven" :(n==8)?"Eight":"Nine"
                :"Invalid Number";
        System.out.println(Result);

    }
}
