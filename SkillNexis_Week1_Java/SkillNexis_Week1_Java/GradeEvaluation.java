import java.util.Scanner;

public class GradeEvaluation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Grade Evaluation ===");
        System.out.print("Enter marks (0-100): ");

        if (!sc.hasNextInt()) {
            System.out.println("Invalid input. Please enter a whole number.");
            sc.close();
            return;
        }

        int marks = sc.nextInt();

        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a value from 0 to 100.");
        } else if (marks >= 80) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }

        sc.close();
    }
}
