package com.kukhtar.repairagency2.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class UserDto {
    //todo: login should be unique
    @NotBlank
    @NotNull
    private String login;
    @NotBlank
    @Size(min = 6)
    @NotNull
    //todo:add regex for password
    private String password;
    @NotNull
    private String fullName;
    private String phoneNumber;
    private String bankAccount;
}
