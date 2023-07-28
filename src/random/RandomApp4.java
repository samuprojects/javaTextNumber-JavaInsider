package random;

import java.util.UUID;

public class RandomApp4 {

    public static void main(String[] args) {

        // Existem cenários em que será preciso criar um identificador único para alguma coisa dentro da aplicação
        // Isso é possível por meio da classe UUID do pacote java.util
        UUID id = UUID.randomUUID();
        String s = id.toString(); // esse objeto UUID possui o método toString que converte para String conforme resultado a seguir
        System.out.println(s);
    }
}
