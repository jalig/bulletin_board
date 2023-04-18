package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AdsDTO {

    private Long pk;
    private Long user;
    private String image;
    private Integer price;
    private String title;
}
