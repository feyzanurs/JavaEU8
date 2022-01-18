package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String name="Aaron", surname="Daniel";
        String fullName= name+" "+surname;
        int age= 19;
        String jobTitle= "SDET", companyNAme="Apple Inc.";
        double salary= 100000.58;
        System.out.println("Full Name of person is " + fullName);
        System.out.println(fullName+" is "+age+" years old.");
        System.out.println(fullName+" is "+jobTitle+", works at "+companyNAme+", and "+fullName+"'s salary is "+salary);

    }
}
