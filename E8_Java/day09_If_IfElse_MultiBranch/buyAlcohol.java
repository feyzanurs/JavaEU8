package day09_If_IfElse_MultiBranch;

public class buyAlcohol {
    public static void main(String[] args) {

        int age= 16;

        boolean eligible= age>=18;

        if(eligible){
            System.out.println("Eligible to buy alcohol");
        }else{
            System.out.println("Not Eligible to buy alcohol");
        }


    }
}
