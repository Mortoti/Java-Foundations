import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1;
        double num2;
        double answer = 0.0;
        boolean validOperation = true;
        String operator;
        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter the operator(+, -, /, *): ");
        operator = scanner.next();
        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        if (operator.equals("+")) {
            answer = num1 + num2;
        } else if (operator.equals("-")) {
            answer = num1 - num2;
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.print("Zero divison error!");
                validOperation = false;
            } else {
                answer = num1 / num2;
            }

        } else if (operator.equals("*")) {
            answer = num1 * num2;
        } else {
            System.out.print("Invalid Operator!!!");
            validOperation = false;

        }

        scanner.close();
        if (validOperation) {
            System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
        }
    }

}
