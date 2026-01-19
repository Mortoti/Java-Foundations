import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double score;
        boolean validOperation = true;
        boolean isFailed = false;
        char grade = 'A';
        System.out.print("Enter your score: ");
        score = scanner.nextDouble();
        if (score >100){
            System.out.println("Invalid Score");
            validOperation = false;
        }
        else if (score >= 90) {
            grade = 'A';
        }
        else if (score >= 80) {
            grade = 'B';
        }
        else if (score >= 70) {
            grade = 'C';
        }
        else if (score >= 60) {
            grade = 'D';

        }
        else if (score >= 0) {
            grade = 'F';
            isFailed = true;
        }
        else{
            System.out.println("Invalid Score");
            validOperation = false;
        }
        scanner.close();
        if (validOperation){
            System.out.println("Hello, you had grade: " + grade);
        }
        if (isFailed) {
            System.out.println("Unfortunately you failed");
        }
    }
}
