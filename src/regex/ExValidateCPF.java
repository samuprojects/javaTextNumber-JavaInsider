package regex;

public class ExValidateCPF {

    public static void main(String[] args) {
        System.out.println(validateCPF("456.678.999-10")); // primeiro formato válido do enunciado
        System.out.println(validateCPF("45667899910")); // segundo formato válido do enunciado
        System.out.println(validateCPF("456 678 999 10")); // terceiro formato válido do enunciado
        System.out.println(validateCPF("456 678 999.10"));
        System.out.println(validateCPF("456-678-999-10"));
    }

    private static boolean validateCPF(String cpf){
        return cpf.matches("\\d{3}([.\\s])?\\d{3}([.\\s])?\\d{3}([-\\s])?\\d{2}");
        // -->  \\d{3}  --> indica uma sequencia de três dígitos
        // -->  ([.\\s])?  --> o ponto de ? indica que pode ocorrer uma ou nenhuma vez o que está entre os parenteses
        // nesse caso é: pode ter a ocorrência só do ponto, ou só do espaço, ou sem nada.
        // -->  ([-\\s])? --> após a última sequencia de 3 dígitos mudamos para só o hífen, ou só espaço, ou nada
        // -->  \\d{2} --> indica a busca dos dois últimos dígitos do cpf
    }
}
