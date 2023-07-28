package random;

import java.util.Random;

public class Dice {

    private final Random random = new Random(); // objeto random para gerar intervalo com método roll

    public Numbers roll(){ // método roll() retorna o record Numbers após chamar outro método duas vezes
        return new Numbers(nextNumber(), nextNumber());
    }

    private int nextNumber () { // evita duplicação de código pois está sendo chamado acima já duas vezes
        return random.nextInt(1, 7); // inclusive / exclusive (ou seja, -1, vai até 6)
    }
}
