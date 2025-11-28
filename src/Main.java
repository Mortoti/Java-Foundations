import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        // My first JAVA Program
        /*
        This
        is
        a
        multi
        line
        comment
         */
        System.out.println("My name is Mortoti");
        System.out.println("My dream is to become the Mosh Hamedani of West Africa");
       // Creating Variables
        //Primitive Variables
        // Integer Variables
        int age = 19;
        System.out.println("age: " + age);

        // Double or Decimal Variables
        double net_worth = 109.3;
        System.out.println("My net worth is: " + net_worth + " Ghana Cedis");

        // Character Variables
        char grade = 'A';
        System.out.println("I had grade " + grade + " in the exams");

        // Boolean Variables
        //boolean isStudent = true;

        //System.out.println("It is " + isStudent + " that he is a student");
        // day 2
        /*
        Reference Variables
        1. Strings
        2. Arrays
        3. Objects
         */
        //Strings
        String name = "Mosh of West Africa"; // unlike the other data types so far, S is capital
        System.out.println(name);


        // Creating a Scanner Object
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Enter your name: ");
        String my_name;
        my_name = scanner.nextLine(); // takes multiple words
        // next takes only one word
        // nextInt for taking integer input
        int my_age;
        System.out.print("How old are you? ");
        my_age = scanner.nextInt();

        System.out.println("My name is " + my_name);
        System.out.println("I am " + my_age + " years old");

        //Testing

        System.out.print("Enter your full name: ");
        String your_name = scanner.next();
        String sec_name = scanner.next();
        System.out.println("your_name= "+ your_name + " and sec_name= " + sec_name);

        System.out.print("Enter your score: ");
        double score = scanner.nextDouble();
        System.out.println(score);

         */

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        System.out.println("It is " + isStudent + " that you are a student");
        scanner.close();

    }


}