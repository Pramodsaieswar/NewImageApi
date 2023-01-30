package com.imageuploads.dto;

import com.imageuploads.entity.Image;
import lombok.*;

@Setter
@Getter
public class ImageDto  {
    private  Long id;
    private String name;
    private String image;
    private String description;
    private String type;
}
