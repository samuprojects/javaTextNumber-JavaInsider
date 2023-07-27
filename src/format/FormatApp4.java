package format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp4 {

    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("en", "US");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale); // o getCurrencyInstance vai passar um padrão monetário conforme o locale passado no parametro
        String formatted = nf.format(n);

        //System.out.println(formatted); // caso dê algum problema na codificação do caractere usar o comando abaixo
        PrintWriter out = new PrintWriter(System.out, true, StandardCharsets.UTF_8);
        out.println(formatted);
    }
}
