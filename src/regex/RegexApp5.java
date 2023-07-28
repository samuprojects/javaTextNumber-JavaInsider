package regex;

import java.util.Arrays;
import java.util.Scanner;

public class RegexApp5 {

    public static void main(String[] args) {

        // "Tokenização" --> é a ideia de quebrar textos em pedaços. Para que isso ocorra precisamos
        // informar (definir) a quebra (como que eu quero quebrar isso).

        String text = "a, b, c, d"; // um caso clássico é usar a vírgula como quebra...

        String[] tokens = text.split(","); // o método split da classe String recebe o padrão para quebra e retorna um Array de strings

        // Cada elemento do array vai receber os textos quebrados e a vírgula some pois serviu como delimitador apenas.
        System.out.println(Arrays.toString(tokens));

        // o split também aceita expressão regular dependendo do cenário de String que você tem

        String text2 = "a1b2c3d";
        String[] tokens2 = text.split("\\d");
        System.out.println(Arrays.toString(tokens2));

        // Existe também a forma de quebrar a String usando a classe Scanner que podemos varrer combinado com o while
        Scanner scanner = new Scanner(text2);
        scanner.useDelimiter("\\d");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

        // A vantagem do Scanner é que pode fazer outras coisas durante o processo de quebra e no split já retorna o array pronto

        // O Scanner também da opção de já fazer a conversão da informação conforme a seguir
        Scanner scanner2 = new Scanner("1,2,3,4");
        scanner2.useDelimiter(",");

        while(scanner2.hasNextInt()){ // enquanto tiver um inteiro
            int e = scanner2.nextInt(); // faça o retorno do valor já convertido em int
            System.out.println(e); // mostranto o valor já convertido

            // Lembrando que lá no split o retorno sempre será um array de Strings, não há conversão da informação
            // aqui no scanner ainda temos outras conversões como nos casos do hasNextBigDecimal...Byte...Double...Long

        }
    }
}
