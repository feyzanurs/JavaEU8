package day10_NestedIF_Tenary;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int s=85;
      String score= (s>=0 && s<=100)?  (s>=60)? "Passed": "Failed":"Invalid Score";
        System.out.println(score);
    }
}
