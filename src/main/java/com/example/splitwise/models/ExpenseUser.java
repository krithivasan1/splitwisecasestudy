package com.example.splitwise.models;

import jakarta.persistence.Entity;

@Entity
public class ExpenseUser extends BaseModel{
    public Expense expense;
}
