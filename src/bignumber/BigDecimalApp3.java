package bignumber;

import java.math.BigDecimal;

@SuppressWarnings("ALL")
public class BigDecimalApp3 {

    public static void main(String[] args) {

        BigDecimal n1 = BigDecimal.valueOf(1.0);
        BigDecimal n2 = BigDecimal.valueOf(1);

        System.out.println(n1 == n2); // já sabemos que a comparação de objetos com == não funciona
        System.out.println(n1.equals(n2)); // especificamente com o equals == também não vai funcionar no caso dos BigDecimal
        // devido a forma como internamente os números são representados no BigDecimal
        System.out.println(n1.compareTo(n2) == 0); // a melhor forma de verificar igualdade é usando o compareTo e testando se é igual a zero

        // pois o compareTo() retorna 0 se for true nesse cenário específico do BigDecimal
    }
}
