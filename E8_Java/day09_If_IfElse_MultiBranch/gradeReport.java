package day09_If_IfElse_MultiBranch;

public class gradeReport {
    public static void main(String[] args) {
        int score= 64;

        if(score>=85){
            System.out.println("A+");
        }else if(score<85 && 80<=score){
            System.out.println("A");
        }else if(score<79 && 70<=score){
            System.out.println("B");
        }else if(score<69 && 65<=score){
            System.out.println("C");
        }else if(score<65 && 60<=score){
            System.out.println("D");
        }else {
            System.out.println("F");
        }

    }
}
