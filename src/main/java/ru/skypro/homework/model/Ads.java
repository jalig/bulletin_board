package ru.skypro.homework.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
public class Ads {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private User author;
    private String description;
    @OneToOne
    private ImageAds image;
    private Integer price;
    private String title;
    @OneToMany(mappedBy = "ads")
    private List<Comment> comments;

}
