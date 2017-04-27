/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

/**
 *
 * @author deividas
 */
public class Item {
    

    protected int id;
    protected String item;
    protected String brand;
    protected int amount;
    protected double price;
    protected int stockUp;  // how many days passed till new goods are delivered
    protected int cartAmount = 0;
    
    public String toCartString()
    {
        return String.format("%10s %10s %.2f %4d", item,brand,price,cartAmount);
    }
    
    //takes amounnt from stock and puts it in carts
    public void putToCart(){
        amount--;
        cartAmount++;
    }
    public void removeItemFromCart()
    {
            cartAmount--;
    
    }
    // reset carts amount;
    public void clearCartAmount(){
        cartAmount = 0;
    }
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the item
     */
    public String getItem() {
        return item;
    }

    /**
     * @param item the item to set
     */
    public void setItem(String item) {
        this.item = item;
    }

    /**
     * @return the brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * @param brand the brand to set
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * @return the stockUp
     */
    public int getStockUp() {
        return stockUp;
    }

    /**
     * @param stockUp the stockUp to set
     */
    public void setStockUp(int stockUp) {
        this.stockUp = stockUp;
    }
    public void addCartAmount()
    {
        cartAmount++;
    }
    public int getCartAmount()
    {
        return cartAmount;
    }
    public void setCartAmount(int amount)
    {
        cartAmount = amount;
    }

    
}
