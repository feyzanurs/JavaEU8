package day11_SwitchStatements;

public class Task_CydeoBatch {
    public static void main(String[] args) {
        String batch="EU", classTime="";

        switch (batch){
            case "US Morning":
                classTime="Class Times are 10-5 EST. M,T,Th, F.";
            break;
            case "US Evening":
                classTime="Class Times are 7-10 EST. M,T,W,Th,S,S.";
            break;
            case "EU":
                classTime="Class Times are 10-5 EST. M,T,W,Th, F.";
            break;
            default:
                classTime="Invalid Batch";
        }
        System.out.println(classTime);
    }
}
