package random;

public class ExDice {

    public static void main(String[] args) {

        Dice dice = new Dice(); // o objeto Dice é duplo, sempre joga 2 dados conforme estrutura da classe Dice

        System.out.println(dice.roll());
        System.out.println(dice.roll());
        System.out.println(dice.roll());
    }
}
