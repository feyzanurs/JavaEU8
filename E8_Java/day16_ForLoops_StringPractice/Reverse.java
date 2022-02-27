package day16_ForLoops_StringPractice;

public class Reverse {
    public static void main(String[] args) {
        /*
        Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
         */

        String str= "Wooden Spoon";
        //  index no>012345678901
        String result=""; // contains reverse version of str
     /* result+=str.charAt(11); // n
      result+=str.charAt(10);
      result+=str.charAt(9);
      result+=str.charAt(8);
      result+=str.charAt(7);
      result+=str.charAt(6);
      result+=str.charAt(5);
      result+=str.charAt(4);
      result+=str.charAt(3);
      result+=str.charAt(2);
      result+=str.charAt(1);
      result+=str.charAt(0);*/
        for(int i=str.length()-1; i>=0; i--) { // i: index numbers of str *starting last index to index 0)
            result += str.charAt(i); // adding each character to result
        }
        System.out.println(result);
    }
        }
