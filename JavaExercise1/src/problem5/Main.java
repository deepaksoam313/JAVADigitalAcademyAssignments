package problem5;

import java.util.Scanner;

class InsufficientFundsException extends RuntimeException {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Deposit amount cannot be negative");
        }
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Withdrawal amount cannot be negative");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds to withdraw " + amount);
        }
        this.balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            BankAccount account = new BankAccount(1000.0);
            System.out.println("Initial Balance: " + account.getBalance());

            while (true) {
                displayMenu();
                int choice = sc.nextInt();
                sc.nextLine(); // Consume the newline character
                switch (choice) {
                    case 1:
                        account.deposit(sc.nextDouble());
                        System.out.println("After Deposit: " + account.getBalance());
                        break;
                    case 2:
                        account.withdraw(sc.nextDouble());
                        System.out.println("After Withdrawal: " + account.getBalance());
                        break;
                    case 3:
                        System.out.println("Your Account balance is : " + account.getBalance());
                        break;
                    case 0:
                        System.out.println("Exiting the application.");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        }catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static void displayMenu() {
        System.out.println("1. Amount Deposit: ");
        System.out.println("2. Amount Withdraw: ");
        System.out.println("3. Show Balance");
        // Add more menu options as needed
        System.out.println("0. Exit");
        System.out.print("Enter your choice: ");
    }
}


