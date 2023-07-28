package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexApp4 {

    public static void main(String[] args) {

        String text = "a3b5hj4j20f29p"; // agora ao invés de somente encontrar padrões vamos trocar por outro valor
        String regex = "\\d"; // nesse caso buscamos por números
        String replacement = "*"; // para serem trocados por *

        Pattern p = Pattern.compile(regex); // colocamos no padrão o que queremos
        Matcher m = p.matcher(text); // colocamos o texto a ser pesquisado o padrão

        // o StringBuilder aqui vai receber o texto do append... e a troca com o valor desejado
        StringBuilder sb = new StringBuilder();
        while (m.find()){ // usamos o while para enquando o método find busca os padrões vai fazer também a troca
            m.appendReplacement(sb, replacement); // esse método recebe um StringBuilder e o que deve ser substituído
        }
        m.appendTail(sb); // sempre usar o appendTail para caso de algum texto ainda não ter passado pelo StringBuilder
        // e receber o padrão desejado

        System.out.println(sb); // esse processo acima é a forma mais complexa e que dá maior comtrole por permitir que
        // além da substituição faça outras coisas. Existe uma outra forma, mais direta, conforme a seguir

        //------------------------------------

        // a classe String tem formas de substituir usando expressões regulares diretamente usando os métodos replaceAll e replaceFirst
        // não confundir com os métodos replace() da classe String que possuem
        // duas sobrecargas para troca de caracteres mas não trabalham com Regex
        // o replaceAll troca todas as ocorrências do padrão desejado
        // o replaceFirst troca apenas a primeira ocorrência do padrão

        System.out.println(text.replaceAll(regex, replacement)); // a saída vai criar uma nova String
        System.out.println(text.replaceFirst(regex, replacement));

    }
}
