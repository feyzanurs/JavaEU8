package day14_String_Part2;

public class Trim_Method {
    public static void main(String[] args) {
        String str1="       bacth 25            "; // deletes the white spaces

        str1= str1.trim(); // "batch25"
        System.out.println(str1);

    }
}
