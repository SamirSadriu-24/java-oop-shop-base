package org.lessons.java.shop;

public class Main {
    public static void main(String[] args) {

        System.out.println("---------------------------------------------------");
        Prodotto prodotto1 = new Prodotto("Pandoro", "Dolce Natalizio Buonissimo", 12.99f, 10);
        System.out.println(prodotto1.getPrice());
        System.out.println(prodotto1.getPriceWithIva());
        System.out.println(prodotto1.getCompleteName());
        
        
        System.out.println("---------------------------------------------------");
        Prodotto prodotto2 = new Prodotto("Panettone", "Dolce Natalizio Buono", 10.54f, 10);
        System.out.println(prodotto2.getPrice());
        System.out.println(prodotto2.getPriceWithIva());
        System.out.println(prodotto2.getCompleteName());
        

    }
}
