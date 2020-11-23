package com.kukhtar.repairagency2.model;

import lombok.Data;

@Data
public class User {
    private Long id;
    private String login;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String bankAccount;
}
