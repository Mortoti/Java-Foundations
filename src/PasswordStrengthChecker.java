/*
Build a program that:
- Asks user to enter a password
- Checks password strength based on length:
  - Less than 6 characters: "Weak password"
  - 6-10 characters: "Medium password"
  - 11+ characters: "Strong password"
- Checks if password is empty

**Bonus:** Check if password contains "123" or "password" and warn them
*/

import java.util.Scanner;
public class PasswordStrengthChecker {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String password;
    System.out.print("Enter your password: ");
    password = scanner.nextLine();
    if (password.contains("123") || password.contains("password")) {
        System.out.println("Password is too easy and can be guessed by attackers");
    }
    else if (password.isEmpty()) {
        System.out.println("You did not enter anything!");
    }
    else if (password.length() >= 11) {
        System.out.println("Strong Password");
    }
    else if (password.length() >= 6) {
        System.out.println("Medium Password");
    }

    else{
        System.out.println("Weak password");
    }
    scanner.close();

    }

}
