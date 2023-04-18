package ru.skypro.homework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private String phone;
    private String role;
    @OneToMany(mappedBy = "author")
    private List<Ads> ads;
    @OneToMany(mappedBy = "author")
    private List<Comment> comments;
    private String password;
    @OneToOne
    private ImageAds image;
}
