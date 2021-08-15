package com.shijie.encap;

public class TestAccount {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jack");
        account.setBalance(60);
        account.setPassword("123456");
        account.showInfo();
        Account account1 = new Account("tom", 70000, "654321");
        account1.showInfo();
    }
}
