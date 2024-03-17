package problem10;

import java.util.*;

class Account {
    private String id;
    private String customerId;
    private double balance;

    public Account(String id, String customerId, double balance) {
        this.id = id;
        this.customerId = customerId;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account ID: " + id + ", Customer ID: " + customerId + ", Balance: " + balance;
    }
}

class Loan {
    private String id;
    private String customerId;
    private double amount;

    public Loan(String id, String customerId, double amount) {
        this.id = id;
        this.customerId = customerId;
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getCustomerId() {
        return customerId;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Loan ID: " + id + ", Customer ID: " + customerId + ", Amount: " + amount;
    }
}

public class Bank {
    private Map<String, Account> accounts;
    private Map<String, Loan> loans;

    public Bank() {
        accounts = new HashMap<>();
        loans = new HashMap<>();
    }

    public void addAccount(Account account) {
        accounts.put(account.getId(), account);
    }

    public void addLoan(Loan loan) {
        loans.put(loan.getId(), loan);
    }

    public void removeAccount(String id) {
        accounts.remove(id);
    }

    public void removeLoan(String id) {
        loans.remove(id);
    }

    public Account findAccount(String id) {
        return accounts.get(id);
    }

    public Loan findLoan(String id) {
        return loans.get(id);
    }

    public List<Account> getAllAccounts() {
        return new ArrayList<>(accounts.values());
    }

    public List<Loan> getAllLoans() {
        return new ArrayList<>(loans.values());
    }

    public List<Account> getAccountsOfCustomer(String customerId) {
        List<Account> result = new ArrayList<>();
        for (Account account : accounts.values()) {
            if (account.getCustomerId().equals(customerId)) {
                result.add(account);
            }
        }
        return result;
    }

    public List<Loan> getLoansOfCustomer(String customerId) {
        List<Loan> result = new ArrayList<>();
        for (Loan loan : loans.values()) {
            if (loan.getCustomerId().equals(customerId)) {
                result.add(loan);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addAccount(new Account("A101", "C1002", 5000));
        bank.addAccount(new Account("A201", "C1003", 8000));
        bank.addLoan(new Loan("L101", "C1002", 2000));
        bank.addLoan(new Loan("L201", "C1003", 5000));

        System.out.println("Find account with ID A101: " + bank.findAccount("A101"));
        System.out.println("All accounts:");
        bank.getAllAccounts().forEach(System.out::println);
        System.out.println("Loans of customer C1002:");
        bank.getLoansOfCustomer("C1002").forEach(System.out::println);
    }
}
