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

//id   item    brand  colour model    size  amount shopsID month day hour

public class Clothes {
    
    private int id;
    private String item;
    private String brand;
    private String colour;
    private String model; //business, casual, sports
    private String size; // format: s,m,l,xl
    private int amount;
    private double price;
    private int month; //format 1-12
    private int day;    //1-30
    private int hour;   //1-24

 
    public Clothes(){    
    }
    // constructor for clothes object;
    public Clothes(int id, String good, String brand, String colour, String model, String size, int amount, double price, int month, int day, int hour){
        this.id = id;
        this.item = good;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.amount = amount;
        this.price = price;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }
    
    //overrides toString method so we could decide ourself how data should be printed out
    @Override
    public String toString(){
        return id + " " + item + " " + brand + " " + model + " " + size + " " + amount + " " + month + " " + day + " " + hour;
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
     * @return the colour
     */
    public String getColour() {
        return colour;
    }

    /**
     * @param colour the colour to set
     */
    public void setColour(String colour) {
        this.colour = colour;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the size
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(String size) {
        this.size = size;
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
     * @return the month
     */
    public int getMonth() {
        return month;
    }

    /**
     * @param month the month to set
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * @return the day
     */
    public int getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
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
    
}
