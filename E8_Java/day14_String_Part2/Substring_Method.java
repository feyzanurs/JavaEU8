package day14_String_Part2;

public class Substring_Method {
    public static void main(String[] args) {
        //substring(beginningIndex, endingIndex)

        String word= "Cydeo School";
                   // 012345...
        String brand=word.substring(0, 4);// it stops on the 4th index. add+1 to print last index you put.
        System.out.println(brand);
        String brands=word.substring(0,4+1);
        System.out.println(brands);
        System.out.println("---------------------------------");
        String word2= "Java Programming Language";
        String s1,s2,s3;
        s1=word2.substring(0,word2.indexOf(" ")); System.out.println(s1); // Java
        s2=word2.substring(word2.indexOf("P"), word2.indexOf("g ")+1); System.out.println(s2);
        s3=word2.substring(word2.indexOf("L"), word2.lastIndexOf("e")+1); System.out.println(s3);
    }
}
