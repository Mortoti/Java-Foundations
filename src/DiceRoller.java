import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        int dice1;
        int dice2;
        int sum;
        Random random = new Random();
        dice1 = random.nextInt(1,7);
        dice2 = random.nextInt(1,7);
        sum = dice1 + dice2;
        System.out.println("Dice 1: " + dice1 + "...... Dice 2: " + dice2);
        System.out.println("The sum of the dice is " + sum);
        System.out.println("Lucky " + sum + "!");



    }
}
