package com.example.recipeapi;

public class FoodModel {
    private String title;
    private String image;

    public String getTitle() {
        return title;
    }

    public String getImage() {
        return image;
    }

    public FoodModel(String title, String image) {
        this.title = title;
        this.image = image;
    }
}
