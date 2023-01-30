package com.imageuploads.entity;

import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Entity
public class Image {
    @Id

    @Column(name = "id")
    private  Long id;
    private String name;
    private String image;
    private String description;

    private String type;
}
