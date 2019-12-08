package com.deepak.recyclerview;

public class Cars {

    private String name;
    private String brand;
    private int image;

    public Cars(String name, String brand, int image) {
        this.name = name;
        this.brand = brand;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}

