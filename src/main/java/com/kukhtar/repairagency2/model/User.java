package com.kukhtar.repairagency2.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "testTable")
public class User {
    @Id
    @GeneratedValue
    private Long id;
    private String login;
    private String password;
    private String fullName;
    private String phoneNumber;
    private String bankAccount;
}
