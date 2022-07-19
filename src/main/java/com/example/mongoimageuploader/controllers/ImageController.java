package com.example.mongoimageuploader.controllers;

import com.example.mongoimageuploader.images.Image;
import com.example.mongoimageuploader.repositories.ImageRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ImageController {

    private ImageRepository imageRepository;

    public ImageController(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    @PostMapping("/images")
    public List<Image> addImages (@RequestBody final List<Image> images) {
        return imageRepository.saveAll(images);
    }

    @GetMapping("/images")
    public List<Image> findImages() {
        return imageRepository.findAll();
    }

    @GetMapping("/images/{productId}")
    public Image findImage(@PathVariable final String imageId) {
        return imageRepository.findById(imageId).orElseGet(Image::new);
    }

}
