import java.util.Scanner;
public class NameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("What is your name: ");
        name = scanner.nextLine();
        if (name.isEmpty()){
            System.out.println("You did not enter your name");

        }
        else{
            System.out.println("Hello " + name + ". I love you!");
        }
        scanner.close();

    }
}
