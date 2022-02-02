package day10_NestedIF_Tenary;

public class Task_CharacterIdentity {
    public static void main(String[] args) {
        char c='@';
        if (c>='0'&& c<='9'){
            System.out.println("Digit");
        }else if ((c>='A' && c<='Z') || (c>='a'&& c<='z')){
            System.out.println("Alphabetic");
        }else{
            System.out.println("Special Character");
        }






    }
}
