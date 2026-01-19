import java.util.Scanner;
public class DrivingEligibility {
    public static void main(String[] args) {
        // Age Checker
        int age;
        Scanner scanner = new Scanner(System.in);
        System.out.print("How old are you? ");
        age = scanner.nextInt();
        scanner.nextLine();
        if (age >= 18){
            System.out.print("You can drive freely ");


        }
        else if (age >=16){
            System.out.print("You can drive under supervison");

        }
        else{
            System.out.print("You are not allowed to drive");
        }
        scanner.close();

    }
}
