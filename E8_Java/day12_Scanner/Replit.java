package day12_Scanner;
import java.util.*;
public class Replit {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Please enter your order:");
        String innn = s.next();
        String in = innn;
        String a = "burger";
        System.out.println(in);
        boolean o= a=="burger";
        System.out.println(o);
        boolean ina = in == a;
        System.out.println(ina);

        //boolean order= in=="burger" || in=="chicken";
        if(ina){
            System.out.println("a");
        }




    }
}
