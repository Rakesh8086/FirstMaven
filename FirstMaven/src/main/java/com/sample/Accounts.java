package com.sample;

public class Accounts {
    private String accountNo;
    private String name;
    private double balance;

    public Accounts(String accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return 
                "accountNo=" + accountNo +
                ", Name='" + name + '\'' +
                ", balance=" + balance
               ;
    }
}