package day08_LogicalOperators_SingleIfStatement;

public class EligibleToVote {
    public static void main(String[] args) {
        String name= "Josh", citizen="USA";
        int age=38;

        boolean isEligible= age>=21;

        //Eligible
        if(isEligible){
            System.out.println("Eligible");
        }
        //not Eligible
        if (!isEligible){
            System.out.println("Not Eligible");
        }
    }
}
