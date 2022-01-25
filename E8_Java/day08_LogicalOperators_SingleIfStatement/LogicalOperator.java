package day08_LogicalOperators_SingleIfStatement;

public class LogicalOperator {
    public static void main(String[] args) {
        int age=19;
        String citizen="UK", name="John";
        boolean isEligible= age>=18 && citizen=="USA";
                            //true && false >> false
        //--------------------------------------
        name="Jack";
        age=14;
        citizen="USA"; // false && true >> false

        //--------------------------------------

        name="Kim Jong Un";
        age=45; //true
        citizen="North Korea";// false
        //true && false >> false


        System.out.println(name+" is eligible to vote: "+isEligible);
        System.out.println("------------------------------------------");

        String name2= "Kate";
        int creditScore=720, age2=23, income=50000;
        boolean isEligible2= creditScore>=700 && age2>=21 && income>=55000;
                        //    true && true >> true - eligible && false >> false =not eligible
        //----------------------------------------------
        //*** boolean isEligible2= creditScore>=700 && age2>=21 && income>=55000; ***

        name2="Carol"; creditScore=800; age2=42; income=70000; // true && true && true >> ELIGIBLE

        /*value changed but compiler executes boolean as false because declared variable isEligible2 is false
        on the line 27. If you move boolean statement to line 30 (before new declared variables),
        it will be executed as true. */

        System.out.println(name2+ " is eligible for loan: "+isEligible2);
        System.out.println("---------------------------------------");
        String name3= "Shawn";
        int age3=21;
        char gender= 'M';
        boolean isEligible3= age3>=18 && (gender== 'M'||gender =='F');
                        //      true && ( ture|| false) >> true
        System.out.println(name3+ " is eligible to register:"+isEligible3);
        System.out.println("--------------------------------------------");

        String name4="Carl", countryOfBirth="UK";
        boolean marriedToUSCitizen= false;
        boolean isEligible4= countryOfBirth=="USA"||marriedToUSCitizen==true;
                        //      false      ||       false >> false
        System.out.println(name4+"is eligible to apply for US citizenship: "+isEligible4);
        System.out.println("----------------------------------------");
        String student= "Ana";
        double gpa=3.5;
        int familyIncome= 100000;
        boolean isEligible5= gpa>=3.5||familyIncome<=60000;
                            // true || no need to check second exp >> true
        System.out.println(student+ " is eligible for scholarships: "+isEligible5);
        System.out.println("---------------------------------------");

        boolean result2=true;
        System.out.println("result2 = " + result2);
        boolean result3= !result2;
        System.out.println("result3 = " + result3);
        System.out.println("----------------------------------------");

        int score=85;
        boolean passed= score >=60;
        boolean failed= !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);














    }
}
