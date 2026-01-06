package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int codex;
    private String name;
    private String description;
    private String brand;
    private float price;
    private float iva;

    public Prodotto(String name, String description, float price, float iva) {
        Random random = new Random();
        this.codex = random.nextInt(300);
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    public Prodotto(String name, String descrizione, String brand, float price) {
        Random random = new Random();
        this.codex = random.nextInt(3000);
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    public int getCodex(){
        return this.codex;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

        public float getIva() {
        return this.iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }
    // public float getPriceWithIva(){
    // float PriceIva = Math.round(this.price * (1 + this.iva/100));
    // return PriceIva;
    // }

    // public String getCompleteName(){
    // String completeName = this.codex + this.name;
    // return completeName;
    // }

}
