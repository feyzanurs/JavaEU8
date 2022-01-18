package day03_EscapeSequences;
/* Escape sequences: must be given with double quote
\n: starts a new line
\t: paragraph space
\": quotation mark
\\: backwards slash
 */
public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java\nPython\nC#"); // starts newline
        System.out.println("--------------------");
        System.out.println("Hello Cydeo!\nHow are you today?\nIt's nice to see you all!\nWhat class do we have next week?");
        System.out.println("\"djjhj\""); // quotation mark
        System.out.println("\t hello motherfucker@@!"); //paragraph space
        System.out.println("----------------------------------");
        System.out.println("My favorite TV show is \"Game of Thrones\"");
    }
}
