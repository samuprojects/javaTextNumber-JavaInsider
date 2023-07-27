package format;

import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.text.NumberFormat;
import java.util.Currency;

public class FormatApp5 {

    public static void main(String[] args) {

        double n = 3879456.21;

        //NumberFormat nf = NumberFormat.getInstance(); // como incluímos um setcurrency mudamos conforme abaixo
        NumberFormat nf = NumberFormat.getCurrencyInstance();

        // NumberFormat possui vários métodos set pode testar para ver outras formatações
        nf.setGroupingUsed(false); // esse remove o separador de milhar
        nf.setMinimumFractionDigits(4); // determina o mínimo de casa decimais o Java preenche com zero se necessário
        nf.setMaximumFractionDigits(4); // determina o máximo de casa decimais o Java preenche com zero se necessário
        nf.setCurrency(Currency.getInstance("EUR")); // para usar esse mudar de getInstance para getCurrencyInstance

        new PrintWriter(System.out, true, StandardCharsets.UTF_8).println(nf.format(n));
    }
}
