package com.shijie.task;

public class CheckingAccount extends BankAccount {
    public CheckingAccount(double intialBalance) {
        super(intialBalance);
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount - 1);
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount + 1);
    }
}
