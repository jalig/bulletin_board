package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FullAds {
    private Integer pk;
    private String firstName;
    private String lastName;
    private String email;
    private String description;
    private String image;
    private String phone;
    private Integer price;
    private String title;

}
