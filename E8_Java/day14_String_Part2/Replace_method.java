package day14_String_Part2;

public class Replace_method {
    public static void main(String[] args) {
        String str="Java is fun, I love learning Java";
       String str2= str.replace("Java","Python");

        System.out.println("str2 = " + str2);

        String email="JohnSmith@yahoo.com";
        email=email.replace("yahoo.com","gmail.com");
        System.out.println("email = " + email);
        String sentence= "Java Java Java Python Python Python C# C# C++ C++ C++ Python Python Python";
       String sentence2= sentence.replace("Python","").replace("  ","");
       // to eliminate space, add space into replacement
      // trim() only for the spaces fo remove at the beginning and at the end. NEVER can use trim() here.
        System.out.println("sentence2 = " + sentence2); //call the replace method one more time to remove space.

        String s= "Dog Dog Dog Dog Dog Dog Dog Dog ";
        s= s.replace("Dog","Cat");
        System.out.println("s = " + s);

        String prog="C# is fun, C# is cool";
        prog=prog.replace("C#", "Java");
        System.out.println("prog = " + prog);

        String s2= "Java"; //Jeve
        s2= s2.replace("a","e");
        System.out.println("s2 = " + s2);
        System.out.println("==================================");

        String result= "Java Java Java Java Java ";
        result=result.replaceFirst("Java", "Python");
        System.out.println("result = " + result);
        String result2= "C# is fun, C# is cool";
       result2= result2.replaceFirst("C#","Java");
        System.out.println("result2 = " + result2);
        String result3="Java";
        result3=result3.replaceFirst("a", "o");
        System.out.println("result3 = " + result3);
        
    }
}
