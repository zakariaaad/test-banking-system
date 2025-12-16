package bank;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class AccountService {

    private final List<Transaction> transactions = new ArrayList<>();
    private int balance = 0;

    public int getBalance() {
        return balance;
    }


    //Function for manage deposit of money
    public void deposit(int amount, LocalDate date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        balance += amount;
        transactions.add(new Transaction(date, amount, balance));
    }

    //Function for manage the withdraw of money
    public void withdraw(int amount, LocalDate date) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
       /* System.out.println("withdraw amount = " + amount);
        System.out.println("withdraw balance = " + balance);*/
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient balance");
        }
        balance -= amount;
        transactions.add(new Transaction(date, -amount, balance));
    }

    public void printStatement() {
        System.out.println("DATE        || AMOUNT  || BALANCE");

        transactions.stream()
                .sorted(Comparator.comparing(Transaction::getDate).reversed())
                .forEach(tx -> System.out.println(
                        tx.getDate() + " || " +
                                tx.getAmount() + " || " +
                                tx.getBalance()
                ));
    }
}

