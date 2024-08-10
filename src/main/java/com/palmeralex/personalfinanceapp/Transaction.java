package com.palmeralex.personalfinanceapp;

import java.util.Date;

public class Transaction {
    private String description;
    private double amount;
    private Date date;

    public Transaction(String description, double amount) {
        this.description = description;
        this.amount = amount;
        this.date = new Date(); // default to the current date
    }

    public String getDescription() {
        return description;
    }

    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                ", date=" + date +
                '}';
    }
}
