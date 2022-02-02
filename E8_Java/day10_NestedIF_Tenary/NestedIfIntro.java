package day10_NestedIF_Tenary;

public class NestedIfIntro {
    public static void main(String[] args) {
        int score=95;

        if (score>=0 && score<=100){ //if score is valid

            if (score>=60){
                System.out.println("Passed");
            }else{
                System.out.println("Failed");
            }
        }else{ // if score is invalid
            System.out.println("Invalid");
        }
        System.out.println("------------------------------");

        int age=25;
        boolean hasId=true;
        if (hasId) { // if the person has ID and 21 years old or not

            if (age > 21) {
                System.out.println("Eligible to buy alcohol");
            } else {
                System.out.println("Not eligible to buy alcohol");
            }
        }else{
        System.out.println("You must have an ID to buy alcohol");}


        System.out.println("---------------------------");
           int number=8;
           if (number>=1 && number<=7) { // if the number is valid (1-7)
               if (number == 1) {
                   System.out.println("Monday");
               } else if (number == 2) {
                   System.out.println("Tuesday");
               } else if (number == 3) {
                   System.out.println("Wednesday");
               } else if (number == 4) {
                   System.out.println("Thursday");
               } else if (number == 5) {
                   System.out.println("Friday");
               } else if (number == 6) {
                   System.out.println("Saturday");
               } else if (number == 7) {
                   System.out.println("Sunday");}
           } else { // if the number is invalid
               System.out.println("Invalid number");
           }

    }

}
