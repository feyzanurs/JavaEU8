package day11_SwitchStatements;

public class Task_CappuccinoBuyer {
    public static void main(String[] args) {
        String size="tall";

        switch (size){
            case "tall":
                System.out.println("Price is $ 3.69\n90 calories");
             break;
            case "grande":
                System.out.println("Price is $ 3.99\n120 calories");
            break;
            case "venti":
                System.out.println("Price is $ 4.29\n150 calories");
            break;
            default:
                System.out.println("Invalid Size");
        }
    }
}
