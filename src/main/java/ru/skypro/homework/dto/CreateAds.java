package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateAds {
    private String description;
    private Integer price;
    private String title;
}
