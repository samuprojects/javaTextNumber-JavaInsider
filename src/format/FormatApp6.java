package format;

import java.util.Arrays;
import java.util.Currency;
import java.util.Locale;

public class FormatApp6 {

    public static void main(String[] args) {

        // se quiser saber quais moedas estão disponíveis para formatação no seu código basta imprimir o método abaixo
        System.out.println(Currency.getAvailableCurrencies());
        System.out.println(Arrays.toString(Locale.getAvailableLocales())); // aqui os locales disponíveis
    }
}
