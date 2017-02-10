package com.example.chc_pc.myapplication;

/**
 * Created by chc-pc on 2017/2/10.
 */

public class Fruit {
    private String name;
    private int imageId;
    public Fruit(String name,int imageId) {
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId() {
        return imageId;
    }
}
