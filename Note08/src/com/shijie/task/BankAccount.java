package com.shijie.task;

public class BankAccount {
    private double balance;

    public BankAccount(double intialBalance) {
        this.balance = intialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
