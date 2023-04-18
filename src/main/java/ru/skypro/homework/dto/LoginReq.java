package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LoginReq {
    private String password;
    private String username;

}
