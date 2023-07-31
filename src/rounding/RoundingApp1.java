package rounding;

public class RoundingApp1 {

    public static void main(String[] args) {


        double d = 10.5; // forma de arredondamento no Java

        long v = Math.round(d); // round recebe um double ou float e retorna um long ou int
        System.out.println(v); // arredondando para cima todos os valores a partir de .5 (depois da vírgula)
                              //  se for .4 ou menos arredonda para 0

        long f = (long) Math.floor(d); // floor arredonda sempre para baixo e retorna um tipo double apesar de ser um inteiro
        System.out.println(f);

        long c = (long) Math.ceil(d); // ceil arredonda sempre para cima e retorna um tipo double apesar de ser um inteiro
        System.out.println(c);

        // como floor e ceil arredondam em 0 é seguro fazer o casting para um long e cortar as casas decimais
    }
}
