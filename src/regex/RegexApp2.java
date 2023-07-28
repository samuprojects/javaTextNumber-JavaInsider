package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp2 {

    public static void main(String[] args) {
        printMatches("abcabc", "ab"); // incluído o modelo da aula anterior em um método
        printMatches("fdklj3l20sxj280z1kj", "\\d"); // usando \\ passamos a indicar os metacaracteres
        printMatches("fdklj3l20sxj280z1kj", "\\d\\d\\d"); // não confundir os placeholders das strings
        printMatches("fdklj3l20sxj280z1kj", "([a-z])+");
        printMatches("fdklj3l20sxj280z1kj", "\\d([a-z])+");

        // Sugestão de estudo da classe Pattern para conhecer outros possibilidades de montar expressões regulares

    }


        private static void printMatches (String text, String regex) {
            Pattern p = Pattern.compile(regex);
            Matcher m = p.matcher(text);

            while(m.find()){
                System.out.format("%d -> '%s'\n", m.start(), m.group());
                // relembrando os placeholders das strings, não esquecer que para cada um o format() exige indicar o atributo com ou sem o método
                /*
                * Conversion Meaning
                * b 	      For formatting an argument that is Boolean
                * c 	      For formatting an argument that is a Unicode character
                * s 	      For formatting an argument that is a string
                * d 	      For formatting an argument that is a decimal integer
                * f 	      For formatting an argument that is a number with a decimal point
                * % 	      For printing only % for the argument, ‘%’
                * n 	      To cause the rest of the text on its right, to go on the next line at the output
                *
                * */
            }
        }
    }