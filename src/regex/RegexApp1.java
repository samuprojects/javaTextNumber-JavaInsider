package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp1 {

    public static void main(String[] args) {

        String text = "abcabc";
        String regex = "b";

        Pattern p = Pattern.compile(regex); // Compile prepara a expressão regular para ser usada para encontrar padrões
        Matcher m = p.matcher(text); // com base no Pattern usamos o Matcher para fazer a procura do padrão desejado

        // Matcher tem o método find() que retorna um booleano se o padrão for encontrado
        while(m.find()){
            System.out.format("%d -> '%s'\n", m.start(), m.group()); // vamos usar o format para trazer a posição e o grupo encontrado
        }
    }
}
