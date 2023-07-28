package random;

import java.util.Random;

public class RandomApp3 {

    public static void main(String[] args) {

        // Outra forma de obter números aleatórios é por meio dos métodos da classe Random
        Random random = new Random();

        for (int i = 0; i < 5; i++){
            System.out.println(random.nextInt(5, 11)); }// doc JAVA informa  inclusive/exclusive = 5/10
        //System.out.println(random.nextDouble(5, 11)); // intervalo em doubles
        //System.out.println(random.nextInt()); // max ou min de inteiros incluindo negativos
        //System.out.println(random.nextInt(10)); // 0 à 9

        // Explicação: os números randomicos não são 100% aleatórios, são pseudo randomicos
        // isso ocorre porque atrás do processo existem vários cálculos matemáticos que entregam esses números aleatoriamente
        // em cenários específicos que seja necessário controlar os números aleatórios é possível informar uma semente
        // cada semente gera números aleatórios específicos, de forma que se chamar a mesma semente obterá os mesmos números
        // a semente é o valor passado em Long como parametro na criação do objeto Random

        System.out.println("-------------------------------------------------"); // para comparar aleatório acima e controlado abaixo
        Random random2 = new Random(1L); // semente 1L

        for (int i = 0; i < 5; i++) {
            System.out.println(random2.nextInt(5, 11));
        }
        // Quando não passamos uma semente o Java gera os números (por sementes) no tempo do sistema em nanosegundos
        // por isso a cada execução os números não são os mesmos

    }
}

