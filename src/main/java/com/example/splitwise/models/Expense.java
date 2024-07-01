package com.example.splitwise.models;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Expense extends BaseModel {
    private User createdBy;
    private List<ExpenseUser> listOfExpenseUser;
    private String description;
    private Group group;
    private ExpenseType expenseType;
    private int amount;

}
