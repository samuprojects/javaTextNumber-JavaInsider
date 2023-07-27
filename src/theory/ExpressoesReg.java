package theory;

@SuppressWarnings("ALL")
public class ExpressoesReg {

    /*
    * Outros Metacaracteres Importantes
    *
    * Quando usamos colchetes [abc] eles definem um grupo de "OU" de caracteres a serem pesquisados
    * exemplos
    *
    * [abc]  ==> aqui esperamos encontrar ou o caractere: a OU b OU c
    * [?1%]  ==> aqui a busca é: ? OU 1 OU %
    *
    * Se combinarmos o uso dos colchetes com o hífen indica uma faixa (range, um intervalo de coisas)
    * exemplos
    *
    * [a-f]  ==> aqui procuramos por caracteres de a até f
    * [a-f0-9] ==> aqui procuramos por caracteres de a até f OU de 0 até 9
    *
    * Relação dos Metacaracteres e Strings
    * Como os padrões de procura geralmente ocorre em String existe o problema da barra invertida \ porque
    * o Java utiliza como caractere de escape em strings como foi visto anteriormente ( \n para quebra de linha \t para tabulação, etc).
    * Para resolver esse problema e fazer com que a barra invertida deixe de ser um caractere de escape é necessário dobrar
    * exemplos
    *
    * String p = "\d";  NÃO COMPILA
    * String p = "\\d"; OK USO CORRETO
    *
    * String p = "\w\d"; NÃO COMPILA
    * String p = "\\w\\d"; OK USO CORRETO
    *
    *
    * Quantificadores
    * permitem especificar padrões baseados em sequência (zero ou mais dígitos, uma ou mais letras, um ou nenhum espaço em branco, etc).
    * ==> * significa Zero ou mais ocorrências
    * ==> + significa Uma ou mais ocorrẽncias
    * ==> ? significa Nenhuma ou uma ocorrência
    *
    * Exemplos de Uso
    * 1)
    * expressão regular para representar CEP com os seguintes formatos 34509-390, 34509 390, 34509390
    * a expressão que se encaixa para aceitar qualquer um dos formatos apresentados é:
    * \d\d\d\d\d([\s-])?\d\d\d ==> de cara é possível observar que todos tem 5 dígitos no início e 3 dígitos no fim
    * e no meio indica que pode variar podendo ser ou um hífen, ou um espaço em branco, ou nada e é indicado...
    * pelo quantificador ==> ? ponto de interrogação (Nenhuma ou uma ocorrência do que está entre parênteses)
    * e o que está entre os parênteses está combinado com os colchetes, ou seja, UM OU OUTRO APENAS se tiver.
    *
    * 2)
    * expressão regular para representar uma string composta por uma ou mais letras (maiúsculas ou minúsculas), um hífen e um ou mais números
    * ([A-Za-z])+-([0-9])+
    *
    * */
}
