import java.util.Scanner;
public class AreaOfRectangle {
    public static void main(String[] args) {
        // Variable Declaration
        double length; // you can take all on the same page though
        double width;
        double area;

        // Creating a Scanner object called scanner
        Scanner scanner = new Scanner(System.in);

        // Taking the input for the Length
        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        //Taking the input for the Width
        System.out.print("Enter the width of the rectangle: ");
        width = scanner.nextDouble();

        //Performing Calculations
        area = (length * width);

        //Printing the results to the user
        System.out.println("The area of a rectangle with a width of: " + width + " and a length of " + length + " is: " + area + ".");
        scanner.close();
    }
}



