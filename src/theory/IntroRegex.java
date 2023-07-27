package theory;

@SuppressWarnings("ALL")
public class IntroRegex {

    /*
     * Introdução às Expressões Regulares
     * São chamadas de regex e utilizadas para encontrar padrões dentro de um conjunto de informações
     * exemplos
     * abcabcabc --> Textual data (conjunto de dados com um padrão)
     * bc --> Pattern / Expression (padrão que deseja encontrar)
     * toda expressão regular vai retornar como resposta a posição onde o padrão foi encontrado e nesse caso
     * o índice sempre começa em zero e termina com o tamanho da String menos 1
     * como foi no exemplo acima uma String de nove caracteres é indexada de 0 a 8
     * os padrões bc foram encontrados na posição 1, 4 e 7
     *
     * Regras gerais
     * a busca é feita sempre da esquerda para a direita (a não ser que seja informado outro critério)
     * os caracteres não são consumidos mais de uma vez, conforme o exemplo a seguir
     * azazazaza --> Textual data
     * aza --> Pattern / Expression
     * resultado do padrão desejado é encontrado somente nas posições dos índices 0 e 4
     * apesar de visivelmente podermos encontrar aza na posição 2 já foi consumido no índice zero seguindo a busca
     * o mesmo ocorre para a posição 6 que foi consumido no padrão encontrado na posição 4
     *
     * Metacaracteres
     * permitem realizar busca dinamica ao invés de um caractere específico
     *
     * \d --> Dígito de 0 a 9
     * \s --> Espaço em branco
     * \w --> Caracteres alfanuméricos (dígitos, letras e "_" o underscore)
     * . --> Qualquer caractere
     *
     * Exemplos de uso
     *
     * Texto -->  a3 d5_?s
     * índice --> 01234567
     * Patterns-> \d ==> 1, 4
     *            \w ==> 0, 1, 3, 4, 5, 7
     *            \s ==> 2
     *            \w\d ==> 0, 3  (aqui representa a combinação dos metacaracteres e o padrão desejado é um alfanumérico seguido de um dígito)
     *            d\ d ==> 3 (ficar atento com a barra invertida ... aqui o padrão desejado é achar a letra d seguido de um dígito)
     */

}
