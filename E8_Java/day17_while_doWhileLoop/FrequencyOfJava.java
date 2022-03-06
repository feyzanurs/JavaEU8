package day17_while_doWhileLoop;

public class FrequencyOfJava {
    public static void main(String[] args) {
        String str= "JavaJavaJavaJavaJavaJavaJavaJavaJava";
        int frequency =0;

        for (int i = 0; i <str.length()-4; i++) {
           String eachSub= str.substring(i,i+4);
            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println("frequency = " + frequency);
    }
}
/*
write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3

 */