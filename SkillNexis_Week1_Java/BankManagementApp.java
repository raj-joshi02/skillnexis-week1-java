import java.util.Scanner;

public class BankManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        System.out.println("================================");
        System.out.println("   WELCOME TO SIMPLE BANK");
        System.out.println("================================");

        do {
            System.out.println("\n----- Main Menu -----");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an option (1-4): ");

            while (!sc.hasNextInt()) {
                System.out.print("Invalid choice. Enter a number from 1 to 4: ");
                sc.next();
            }
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ₹");
                    if (sc.hasNextDouble()) {
                        double deposit = sc.nextDouble();
                        if (deposit > 0) {
                            balance += deposit;
                            System.out.printf("Deposit successful. Current balance: ₹%.2f%n", balance);
                        } else {
                            System.out.println("Amount must be greater than zero.");
                        }
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ₹");
                    if (sc.hasNextDouble()) {
                        double withdrawal = sc.nextDouble();
                        if (withdrawal <= 0) {
                            System.out.println("Amount must be greater than zero.");
                        } else if (withdrawal > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            balance -= withdrawal;
                            System.out.printf("Withdrawal successful. Current balance: ₹%.2f%n", balance);
                        }
                    } else {
                        System.out.println("Invalid amount.");
                        sc.next();
                    }
                    break;

                case 3:
                    System.out.printf("Your current balance is: ₹%.2f%n", balance);
                    break;

                case 4:
                    System.out.println("Thank you for using Simple Bank. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1, 2, 3, or 4.");
            }
        } while (choice != 4);

        sc.close();
    }
}
