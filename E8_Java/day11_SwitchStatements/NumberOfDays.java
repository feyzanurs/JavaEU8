package day11_SwitchStatements;

public class NumberOfDays {
    public static void main(String[] args) {
        int num=9;
        int year=2000;
        if (num>=1 && num<=12){
            switch (num){
                case 2:
                    if (year%4==0) {
                        System.out.println("29Days");
                    }else{
                        System.out.println("28 Days");
                    }
                break;
                case 4: case 6: case 9: case 11:
                    System.out.println("30 Days");
                break;
                default:
                    System.out.println("31 Days");
            }
        }
    }
}
