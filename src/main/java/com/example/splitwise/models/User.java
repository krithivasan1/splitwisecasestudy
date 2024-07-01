package com.example.splitwise.models;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User extends BaseModel{
    private String username;
    private String password;
    private String phoneNumber;
}
