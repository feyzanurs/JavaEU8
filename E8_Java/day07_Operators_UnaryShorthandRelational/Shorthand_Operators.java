package day07_Operators_UnaryShorthandRelational;

public class Shorthand_Operators {
    public static void main(String[] args) {
        //assignment: = (this means not equal, assigning value)
        int number = 100;
        System.out.println("number = " + number); //100

        number=200;
        System.out.println("number = " + number);//200

        // ***JAVA EXECUTES THE CODES TOP TO BOTTOM***

        String word="Java Programming";
        System.out.println("word = " + word); //Java Programming
        word= "Wooden Spoon";
        System.out.println("word = " + word);
        word="Cydo";
        System.out.println("word = " + word);

        double num=2.5;
        System.out.println("num = " + num);

        num+=5.5;
        System.out.println("num = " + num);

        System.out.println(" ");
        double availableBalance=1000.50;

        availableBalance+=300;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("-----------------------------------");

        //withdrawing 500$
        availableBalance-=500;
        System.out.println("availableBalance = " + availableBalance);

        //withdrawing 200$, depositing 400$
        availableBalance-=200;
        availableBalance+=400;
        System.out.println("availableBalance = " + availableBalance);
        System.out.println("--------------------------------------");

        double salary=50000.50;
        System.out.println("salary = " + salary);
        salary*=2;
        System.out.println("salary = " + salary);
        double doge= 0.000000001;
        doge*=1000000;
        System.out.println("doge = " + doge);
        System.out.println("----------------------------------------");
        double num2=25000;
        num2=num2/2; //num2/=2;
        System.out.println("num2 = " + num2);
        System.out.println("-----------------------------------------");
        double num3=100;

        num3%=3;
        System.out.println("num3 = " + num3);

        int amount=127; //cents
        int quarters=127/25;
        int cents=127%25;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        System.out.println("-----------------------------------------");
        cents =127;
        cents%=25;
        System.out.println("cents = " + cents);

        System.out.println("-------------------------------------------");
        int y=300;
        y%=16;
        System.out.println("y = " + y);



    }
}
