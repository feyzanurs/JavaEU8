package day13_String_part1;

public class Task_Initials {
    public static void main(String[] args) {
        /*
        write a program that can return the initials of the user
          ex:
                cybertek
                school
            output:
                C.S
         */
        String name= "Feyza";
        String last= "Nur";
        char n=name.charAt(0);
        char l=last.charAt(0);
        String initials= n+"."+l;
        System.out.println("initials = " + initials);
    }
}
