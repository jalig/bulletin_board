package ru.skypro.homework.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.Instant;

@Getter
@Setter
public class CommentDTO {
    private Long author;
    private String authorImage;
    private String authorFirstName;
    private Instant createdAt;
    private Long pk;
    private String text;
}
