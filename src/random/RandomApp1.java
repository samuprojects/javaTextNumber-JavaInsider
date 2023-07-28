package random;

public class RandomApp1 {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            double d = Math.random(); // a forma mais fácil de gerar números aleatórios (sempre retorna um double)
            System.out.println(d); // a faixa do número vai de 0 até quase 1 (nunca retorna 1 completo)

            // ou seja o menor valor é zero e o maior valor é 0.9999999... com mais várias outras casas decimais

            // para gerar números em outros intervalos podemos usar a matemática para chegar no resultado
            // o conceito é gerar o número e multiplicar pelo range que deseja obter (*10, *100, *1000...)
            // ou gerar o número e multiplicar pela quantidade específica do intervalo seguido da soma do primeiro númerp desse intervalo específico

            // por exemplo se quiser gerar numeros entre 0 e 10, pode fazer 0.639*10 = 6.39 (corta as casas decimais)
            // ou ainda 0.321 *10 = 3.21 corta as casas decimais

            // outro exemplo: obter números de 10 a 20 (matematicamente tem um intervalo de 11 dígitos)
            // número gerado * 11 = vai dar um resultado, somar com 10 que é o mínimo desse intervalo específico
            // 0.264 * 11 = 2.904 + 10 = 12.904 (corta as casas decimais)

            // essa é a lógica para gerar números aleatórios em qualquer intervalo
        }
    }
}
