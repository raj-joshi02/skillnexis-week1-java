import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Basic Calculator ===");
        System.out.print("Enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        System.out.print("Enter second number: ");
        double b = sc.nextDouble();

        switch (operator) {
            case '+':
                System.out.println("Result: " + (a + b));
                break;
            case '-':
                System.out.println("Result: " + (a - b));
                break;
            case '*':
                System.out.println("Result: " + (a * b));
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.println("Result: " + (a / b));
                }
                break;
            default:
                System.out.println("Invalid operator. Please use +, -, *, or /.");
        }

        sc.close();
    }
}
