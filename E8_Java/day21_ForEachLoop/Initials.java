package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {
        String[] names= {"Cydeo School", "Wooden Spoon", "Java Programming ", "SQL programming",
                "Selenium Automation", "API testing", "Database Testing", "Manual Testing"};

        for (String each : names) {
            String initial=each.charAt(0)+"."+each.charAt(each.indexOf(" ")+1);
            System.out.println(initial);
        }
    }
}