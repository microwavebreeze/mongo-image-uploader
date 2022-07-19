package com.example.mongoimageuploader.images;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Document
public class Image {

    @Id
    private String id;
    private String description;
    private LocalDate date;
    private String url;

    @Field("imageUrl")
    private String image;

}
