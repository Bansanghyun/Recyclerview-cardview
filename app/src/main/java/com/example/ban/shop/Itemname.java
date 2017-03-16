package com.example.ban.shop;

/**
 * Created by Ban on 2017-03-16.
 */

public class Itemname {

    String name;
    int image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Itemname (String name, int image){

        this.name = name;
        this.image = image;

    }
}
