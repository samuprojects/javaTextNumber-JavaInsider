package format;

@SuppressWarnings("ALL")
public class Account {
    private final String number;
    private final String name;
    private final double balance;

    public Account(String number, String name, double balance) {
        this.number = number;
        this.name = name;
        this.balance = balance;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        //return number + " " + name + " " + balance; //vamos formatar o toString

        // %s é para String, %f é para numeros com casas decimais, lembrando que para cada Placeholder na String temos que associar um atributo
        // o %11 é para deixar um tamanho padrão, o que for menor é completado com espaços em branco
        // se quiser alinhar a esquerda usar o sinal de menos -
        // se inserir uma tabulação usar \t
        // se quiser mostrar o padrão de duas casas após a vírgula usar .2
        return String.format("%11s\t\t%-20s\t%.2f", number, name, balance);
    }
}
