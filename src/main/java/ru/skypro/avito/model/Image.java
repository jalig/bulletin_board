package ru.skypro.avito.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
@Data
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Lob
    @Type(type = "binary")
    @Column(name = "image")
    private byte[] image;
    @Column(name = "file_size")
    private Long fileSize;
    @Column(name = "media_type")
    private String mediaType;
}
