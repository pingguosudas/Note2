package com.shijie.task;

public class SavingsAccount extends BankAccount {

    private int count = 3;
    private double rate = 0.01;
    public SavingsAccount(double intialBalance) {
        super(intialBalance);
    }

    public void earnMonthlyInterest() {
        count = 3;
        super.deposit(getBalance() * rate);
    }

    @Override
    public void deposit(double amount) {
        if (count > 0) {
            super.deposit(amount);
        } else {
            super.deposit(amount - 1);
        }
        count--;
    }

    @Override
    public void withdraw(double amount) {
        if (count > 0) {
            super.withdraw(amount);
        } else {
            super.withdraw(amount + 1);
        }
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int month) {
        this.count = month;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }
}
