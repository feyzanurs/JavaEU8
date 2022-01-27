package day09_If_IfElse_MultiBranch;

public class EligibleToVote {
    public static void main(String[] args) {

        int age= 18;
        String citizen= "USA";
        char doubleCitizenship= 'N';

        boolean canVote= (age>=18) && citizen=="Slovenia" && doubleCitizenship=='N';

        if (canVote){
            System.out.println("You can Vote");
        }else{
            System.out.println("You are not eligible to vote!");
        }
    }
}
