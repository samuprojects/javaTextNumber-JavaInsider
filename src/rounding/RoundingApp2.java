package rounding;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundingApp2 {

    public static void main(String[] args) {

        // o BigDecimal tem o método setScale para informar o número de casas decimais desejada e depois, dentre vários outros métodos existes,
        // informar qual o tipo de arredondamento desejado (sugestão de estudo da documentação JAVA caso tiver de aprofundar o assunto)
        BigDecimal d = BigDecimal.valueOf(10.43);
        d = d.setScale(1, RoundingMode.UP); // não esquecer que vai gerar outro objeto pois o BigDecimal é imutável

        System.out.println(d);

    }
}
