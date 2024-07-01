package com.example.splitwise.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter

public class Group extends BaseModel{
    private String name;
    private String description;
    private List<User> listUser;
    private User createdBy;
    private List<Expense> listExpense;
}
