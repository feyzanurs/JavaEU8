package day15_ForLoops;

public class WarmupTask_replaceX {
    public static void main(String[] args) {
        /*
        Write a program that asks user to enter a word. and replace all
        the x or X with character a
        Input: xcodeX
        Output: acodea
         */
        String str="xcodeX";
        str=str.replace("x","a").replace("X","a"); //acodeX
        System.out.println(str);

    }
}
