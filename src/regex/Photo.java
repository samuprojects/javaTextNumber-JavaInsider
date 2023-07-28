package regex;

import java.util.Scanner;

@SuppressWarnings("ALL")
public class Photo {

    private final int sequence;
    private final int year;
    private final String city;

    public Photo(int sequence, int year, String city) {
        this.sequence = sequence;
        this.year = year;
        this.city = city;
    }

    public int getSequence() {
        return sequence;
    }

    public int getYear() {
        return year;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "sequence=" + sequence +
                ", year=" + year +
                ", city='" + city + '\'' +
                '}';
    }

    public static Photo createFromFileName(String fileName) {
        // -> IMG_00013-1988-Sao_Paulo.jpg

        Scanner scanner = new Scanner(fileName); // aqui optou-se por utilizar o scanner para varrer o nome do arquivo
        scanner.useDelimiter("[-.]"); // método do scanner para delimitar o padrão para busca e fazer a tokenização

        // scanner.next captura primeiro grupo token, replaceAll aplica as mudanças e o Integer.parseInt converte tudo em inteiro
        int sequential = Integer.parseInt(scanner.next().replaceAll("\\D", ""));
        System.out.println("S => " + sequential);

        // scanner.nextInt() já faz a captura do segundo grupo como números inteiros (primitivos)
        int year = scanner.nextInt();
        System.out.println("Y => " + year);

        // scanner.next() captura o terceiro grupo da String com a cidade e replaceAll remove todos os _ underscores por " " caracteres em branco
        String city = scanner.next().replaceAll("_", " ");
        System.out.println("C => " + city);

        // Por fim passamos os três resultados como atributos (exigidos pelo Construtor) para um novo objeto Photo
        return new Photo(sequential, year, city);
    }
}
