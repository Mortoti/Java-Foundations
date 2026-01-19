import java.util.Scanner;
public class Cart {

    public static void main(String[] args) {
        String item;
        int quantity;
        double price = 23.5;
        double totalPrice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What item would you like to buy? ");
        item = scanner.nextLine();
        System.out.println("\n How many do you want to buy? ");
        quantity = scanner.nextInt();
        totalPrice = price * quantity;
        System.out.println("You just bought " + quantity + " " + item + "(s)" );
        System.out.print("The total amount is " + "$" +totalPrice);




        scanner.close();



    }
}
