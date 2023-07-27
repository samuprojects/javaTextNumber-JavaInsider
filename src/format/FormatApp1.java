package format;

public class FormatApp1 {

    public static void main(String[] args) {

        int n = 2;
        for (int i = 1; i <= 10; i++){
            // String s = n + " x " + i + " = " + (n * 1); // vamos melhorar essa escrita usando o format()
            //String s = String.format("%d x %d = %d", n, i, n * i); // varargs são parametros ilimitados, pode não passar nada como pode passar vários outros
            //System.out.println(s); outra forma é passar o System.out.format passando direto os parametros
            System.out.format("%d x %d = %d\n", n, i, n * i); // acrescentamos o n para quebrar a linha
            //System.out.printf("%d x %d = %d\n", n, i, n * i); // faz a mesma coisa do format, esse é conhecido por causa da linguagem C

        } // Recomendação de estudo https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Formatter.html
    }
}
