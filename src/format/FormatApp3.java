package format;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatApp3 {

    public static void main(String[] args) {

        double n = 3456.21;

        Locale locale = new Locale("pt", "BR"); // força o Number format a utilização padrão brasileiro

        NumberFormat nf = NumberFormat.getInstance(locale); // sem o parametro dentro do getInstance a formatação segue regras do S.O.
        String formatted = nf.format(n);

        System.out.println(formatted);
    }
}
