package day14_String_Part2;

public class EmailDomain {
    public static void main(String[] args) {
        String email="Cydeo.School@gmail.com";

        //domain
        int beginningIndex=email.indexOf("@")+1;
        int endingIndex=email.lastIndexOf(".");
       String domain= email.substring(beginningIndex,endingIndex);
        System.out.println(domain);
        System.out.println("-----------------------------");

        String str1= "Java is fun, Java is cool, I love Java";
        String s1= str1.substring(0, str1.lastIndexOf(", J") ); // java is fun
        System.out.println(s1);
        String s2= str1.substring(str1.indexOf(" J")+1, str1.lastIndexOf(", "));
        System.out.println(s2);
        String s3= str1.substring(str1.indexOf("I"),str1.lastIndexOf("a")+1);
        System.out.println(s3);
    }
}
