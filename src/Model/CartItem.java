/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Sopnopriyo
 */
public class CartItem {
    
    private Item item;
    private int quantity;
    private double price;
    private final String IDGame;

    public CartItem(Item item, int quantity, double price, String IDGame) {
        this.item = item;
        this.quantity = quantity;
        this.price = price;
        this.IDGame = IDGame;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public String getIDGame(){
        return IDGame;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
