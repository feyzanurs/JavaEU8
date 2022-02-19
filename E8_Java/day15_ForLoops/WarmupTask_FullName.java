package day15_ForLoops;

public class WarmupTask_FullName {
    public static void main(String[] args) {
        String name="cyDEo",
                lastname="SCHOOL";
        name=name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        //      C                              +    ydeo >> "Cydeo"

         name=(""+name.charAt(0)).toUpperCase()+ name.substring(1).toLowerCase();//
        //       "C"                           + ydeo
        //anything concatenating with "" becomes a String.
        // Otherwise,you cannot call another methods belonging to String since the char is used.
        lastname=lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
        System.out.println(name);
        System.out.println(lastname);
        String fullName=name+" "+lastname;
        System.out.println(fullName);
    }
}
/*
        Write a program that asks user to enter first and last names, and
        then prints the full name in regular format (first character in upper
        case)
        input:
        firstName = "cyDEo"
        lastName = "SCHOOL";
        output:
        Cydeo School
 */