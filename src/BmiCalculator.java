/*
Create a Body Mass Index calculator:
- Ask for weight (kg) and height (meters)
- Calculate BMI: `weight / (height * height)`
- Use if/else to categorize:
  - Below 18.5: Underweight
  - 18.5-24.9: Normal weight
  - 25-29.9: Overweight
  - 30+: Obese

**Bonus:** Format the BMI to 2 decimal places using `printf`

 */
import java.util.Scanner;
public class BmiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height;
        double weight;
        double bmi = 0;
        System.out.print("Enter the height: ");
        height = scanner.nextDouble();
        System.out.print("Enter your weight: ");
        weight = scanner.nextDouble();
        bmi = weight / (height * height);
        System.out.printf("Hello! Your BMI is: %.2f\n", bmi );
        System.out.println("This is my assessment of your BMI...");
        if (bmi >= 30) {
            System.out.println("Obese");
        }
        else if (bmi >= 25) {
            System.out.println("Overweight");
        }
        else if (bmi >= 18.5) {
            System.out.println("Normal Weight");
        }
        else{
            System.out.println("Underweight");
        }
        scanner.close();

    }
}
