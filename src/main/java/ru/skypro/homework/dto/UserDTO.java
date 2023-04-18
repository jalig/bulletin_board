package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

import java.awt.*;


@Getter
@Setter
public class UserDTO {
    private Integer id;
    private String username;
    private String firstName;
    private String lastName;
    private String phone;
    private Image image;
}