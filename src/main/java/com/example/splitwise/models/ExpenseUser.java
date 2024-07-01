package com.example.splitwise.models;

import jakarta.persistence.Entity;

@Entity
public class ExpenseUser extends BaseModel {
    private Expense expense;
    private User createdBy;
    private int amount;
    private ExpenseUserType expenseUserType;
}
