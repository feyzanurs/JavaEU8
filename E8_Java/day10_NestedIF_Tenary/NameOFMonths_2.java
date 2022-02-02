package day10_NestedIF_Tenary;

public class NameOFMonths_2 {
    public static void main(String[] args) {
        int n= 10;
        String result= (n==1)?"JANUARY":(n==2)?"FEBRUARY":(n==3)?"MARCH":(n==4)?"APRIL"
                :(n==5)?"MAY":(n==6)?"JUNE":(n==7)?"JULY":(n==8)?"AUGUST":(n==9)?"SEPTEMBER"
                :(n==10)?"OCTOBER":(n==11)?"NOVEMBER":"DECEMBER";
        System.out.println(result);
    }
}
// number of ? and number of : always has to be equal!
// If you have 10? you have to have 10: as well!
//Giving parenthesis are optional