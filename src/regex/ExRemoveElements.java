package regex;

public class ExRemoveElements {

    public static void main(String[] args) {

        String text = "J1a2v3a4I5n6s7i8d9er é2 nota9 m6i7l t1o0p0!0";
        System.out.println(text.replaceAll("[0-9]", "")); // remove números 0 a 9
        System.out.println(text.replaceAll("[^0-9]", "")); // mantém apenas os números 0 a 9
        System.out.println(text.replaceAll("\\d", "")); // usei essa opção
        System.out.println(text.replaceAll("\\D", "")); // usei essa opção
    }
}
