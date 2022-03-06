package day17_while_doWhileLoop;

public class RemovedDuplication {
    public static void main(String[] args) {
        String str="AAABBBCCC";
        String result=""; //ABC

        for (int i = 0; i <str.length() ; i++) {
            String ch=""+str.charAt(i); //"A","A","A", "B","B","B","B", "C", "C" ,"C"
           if(result.contains(ch)){ // if the result already contains the character
               continue; //skips
           }
           result+=ch;
        }
        System.out.println(result);
    }
}
