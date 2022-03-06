package day17_while_doWhileLoop;

public class FrequencyOfWord_WhileLoop {
    public static void main(String[] args) {
        String str="Java Java Java Python Python";
        int Java=0;
        int Python=0;
        while(str.contains("Java")|| str.contains("Python")){
            if(str.contains("Java")){
                str= str.replaceFirst("Java","");
                Java++;
            }
            if (str.contains("Python")){
                str=str.replaceFirst("Python","");
                Python++;
            }

        }
        System.out.println("Java = " + Java);
        System.out.println("Python = " + Python);
        System.out.println("----------------------------------");
        String sentence="cat cat cat cat cat dog dog dog dog dog dog dog";
        sentence=sentence.toLowerCase();
        int countCat=0;
        int countDog=0;
        while(sentence.contains("cat")|| sentence.contains("dog")){
            if (sentence.contains("cat")){
           sentence= sentence.replaceFirst("cat", "");
            countCat++;}
            if (sentence.contains("dog")){
          sentence=sentence.replaceFirst("dog", "");
            countDog++;}
        }
        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);
    }
}
