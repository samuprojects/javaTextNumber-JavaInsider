package format;

public class FormatApp2 {

    public static void main(String[] args) {

        var a1 = new Account("45432-1", "Pedro Duarte", 150);
        var a2 = new Account("100-2", "Maria Silva", 1430.2);
        var a3 = new Account("4387328-0", "Roberto Teixeira", 0);
        var a4 = new Account("99787-1", "Joana Junqueira", 99.5);

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
        System.out.println(a4);
    }
}
