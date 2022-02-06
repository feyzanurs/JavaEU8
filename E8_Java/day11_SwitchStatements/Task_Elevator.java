package day11_SwitchStatements;

public class Task_Elevator {
    public static void main(String[] args) {
        int floorNumber= 3;
        String floor= "";
        switch (floorNumber){
            case 1:
                floor="Floor 1\nCompanies: Lobby, Verizon, Starbucks";
            break;
            case 2:
                floor="Floor 2\nCompanies: Cybertek, NASA, Intelsat";
            break;
            case 3:
                floor= "Floor 3\nCompanies: Lyft, BofA, Stakehouse";
            break;
            case 4:
                floor="Floor 4\nCompanies: FosterAI";
            break;
            case 5:
                floor="Floor 5\n TERACE CAFE";
            break;
            default:
                floor="Invalid Floor";
        }
        System.out.println(floor);
    }
}
