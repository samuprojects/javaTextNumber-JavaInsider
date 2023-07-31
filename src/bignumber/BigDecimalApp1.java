package bignumber;

import java.math.BigDecimal;

public class BigDecimalApp1 {

    public static void main(String[] args) {

        // assim como existe o BigInteger para inteiros muito grandes o BigDecimal pode armazenar valores com casas decimais que não cabem num double
        //BigDecimal big = new BigDecimal(34473897.10); // não é a melhor forma de usar o BigDecimal
        BigDecimal big = new BigDecimal("34473897.10"); // é melhor usar String
        System.out.println(big);
        big = big.multiply(BigDecimal.TEN); // como é imutável precisa atribuir novamente à variável o novo valor

        // de acordo com o tipo primitivo e tamanho do número é possível extrair, como no BigInteger, utilizando
        // doubleValue(), longValue(), intValue(), etc, tendo o cuidado que o casting pode trazer resultados inconsistentes se acima do padrão primitivo.

        System.out.println(big);


    }
}
