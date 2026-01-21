import java.util.Scanner;
import java.util.Random;

public class CoinFlipSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userGuess;
        boolean isHead;
        String guess;
        System.out.print("What is your guess(1: Head , 2: Tail  ::: ");
        userGuess = scanner.nextInt();
        isHead = random.nextBoolean();
        if (isHead && userGuess == 1) {
            System.out.println("You got it");

        }
        else if (!isHead && userGuess == 2) {
            System.out.println("You got it");
        }
        else{
            System.out.println("You are wrong");
        }
        if (isHead) {
            guess = "Head";
        }
        else{
            guess = "Tail";
        }
        System.out.println("The computer chose: " + guess);
        scanner.close();

    }
}
