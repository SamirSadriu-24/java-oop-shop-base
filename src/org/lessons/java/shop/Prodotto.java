package org.lessons.java.shop;
import java.util.Random;

public class Prodotto {
    public int codex;
    public String name;
    public String description;
    public float price;
    public float iva;

    public Prodotto(String name, String description, float price, float iva ){
        Random random = new Random();
        this.codex = random.nextInt(300);
        this.name= name;
        this.description = description;
        this.price = price;
        this.iva = iva;

    }

    public float getPrice(){
        return this.price;
    }
    
    public float getPriceWithIva(){
        float PriceIva = Math.round(this.price * (1 + this.iva/100));
        return PriceIva;
    }
    
    public String getCompleteName(){
        String completeName = this.codex + this.name;
        return completeName;
    }


}
