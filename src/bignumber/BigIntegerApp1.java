package bignumber;

import java.math.BigInteger;

public class BigIntegerApp1 {

    public static void main(String[] args) {

        // depois do int para números grandes podemos usar o long, porém a casos que nem o long suporta
        //long n = 4983748945743897556545645649L;

        // nesse cenário temos a classe BigInteger do pacote java.math e representa um número grande em extremo
        // como ele representa esse número através de grupos de bytes, virtualmente se torna infinito o número
        // a forma mais comum de criar um BigInteger é a partir de uma String (porque em primitivos não cabe)
        BigInteger big = new BigInteger("4983748945743897556545645649");

        System.out.println(big);

        // por causa desse cenário não podemos usar os operadores matemáticos básicos e por isso dependemos
        // de métodos para realizar operações.
        // Outro ponto é que BigIntegers são imutáveis por isso uma operação nele resulta em um novo BigInteger

        // para reatribuir passamos a variável e usamos o add para somar por exemplo 10 com a constante TEN

        big = big.add(BigInteger.TEN);
        System.out.println(big);

        // além desse temos outros métodos como o subtract, o multiply, o divide, divideAndRemainder (resto da divisão)

        // abs para remover o sinal, toByteArray se quiser gravar essa informação em algum lugar
        // intValuepara extrair um int de dentro (se for desse tamanho), ou um long com longValue (se for desse tamanho)

        // outra forma de criar BigInteger (assumindo que o numero que vai representar cabe num primitivo) é usando o valueOf
        BigInteger big2 = BigInteger.valueOf(100); // retorna um long
        System.out.println(big2);
        System.out.println(big2.intValue()); // como cabe num int podemos converterpara int também nesse caso

        // ou seja BigInteger é usado em situações muito específicas que trabalham com números muito grandes
        // e para manipular algum valor somente usando métodos da classe BigInteger


    }
}
