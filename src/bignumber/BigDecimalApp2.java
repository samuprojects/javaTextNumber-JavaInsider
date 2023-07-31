package bignumber;

import java.math.BigDecimal;

public class BigDecimalApp2 {

    public static void main(String[] args) {

        //double amount = 1.09 - 0.62 + 0.54 - 2.0; // trabalhar com double em valores monetários pode ter problemas
        //System.out.println(amount); // o arredondamento começa a ser prejudicado e pode chegar a "sobrar" ou "faltar" 1 centavo...

        // Isso ocorre por causa da forma que o double e o float é representado no Java e em outras linguagens
        // Por isso as duas formas de representar valores monetários é usando inteiros (só fazendo o posicionamento das vírgulas)
        // ou o BigDecimal, que é o mais usado, que representa os números internamente de outra forma sem causar transtornos no arredondamento


        BigDecimal amount = BigDecimal.valueOf(1.09);
        amount = amount.subtract(BigDecimal.valueOf(0.62));
        amount = amount.add(BigDecimal.valueOf(0.54));
        amount = amount.subtract(BigDecimal.valueOf(2));

        // do ponto de vista de memória gasta mais, porém, no quesito financeiro evitará vários transtornos e se torna irrelevante
        System.out.println(amount);

    }
}
