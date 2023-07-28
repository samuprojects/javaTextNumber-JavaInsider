package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp3 {

    public static void main(String[] args) {

        Pattern p = Pattern.compile("\\s"); // aqui com o matches será false pois estamos buscando apenas o espaço em branco
        Matcher m = p.matcher("abc def"); // para representar essa string deveria ser \\w*\\s\\w*

        // o método matches da classe Matcher retorna um booleano indicando se o padrão desejado é encontrado na String
        System.out.println(m.matches());

        // aqui o resultado é true pois a string é composta de 1 ou mais dígitos
        // a própria classe String já possui esse método matches() embutido, sendo uma vantagem usa-lo pois...
        // dispensa o uso do Pattern e Matcher (pois são chamados internamente na execução do código).
        System.out.println("123".matches("\\d+"));
    }
}
