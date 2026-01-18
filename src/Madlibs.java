import java.util.Scanner;
public class Madlibs {
    public static void main(String[] args) {
        String animal;
        String sticky;
        String dance;
        String celebrity;
        String sound;
        String food;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of your favorite animal: ");
        animal = scanner.nextLine();
        System.out.println("Enter something sticky: ");
        sticky = scanner.nextLine();
        System.out.println("What is your favorite dance move: ");
        dance = scanner.nextLine();
        System.out.print("What is the name of your favorite Celebrity: ");
        celebrity = scanner.nextLine();
        System.out.print("What silly sound do you know of? ");
        sound = scanner.nextLine();
        System.out.print("What is your favorite food? ");
        food = scanner.nextLine();
        System.out.println("My friends and I ordered pizza, but instead of delivery, a "+ animal + " showed up wearing a chef hat!");
        System.out.println("It was covered in " + sticky + " and started doing " + dance +".");
        System.out.println("Suddenly, " + celebrity + " burst through the door yelling '" + sound + "!'");
        System.out.println("The pizza had " + food + " on it instead of cheese. We ate it anyway!");
        scanner.close();


    }
}