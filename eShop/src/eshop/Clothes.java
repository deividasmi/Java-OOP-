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

//id   good    brand  colour model    size  amount shopsID month day hour

public class Clothes {
    
    private int id;
    private String good;
    private String brand;
    private String colour;
    private String model; //business, casual, sports
    private String size; // format: s,m,l,xl
    private int amount;
    private int month; //format 1-12
    private int day;    //1-30
    private int hour;   //1-24

    /**
     * @return the id
     */
    
    public Clothes(){    
    }
    // constructor for clothes object;
    public Clothes(int id, String good, String brand, String colour, String model, String size, int amount, int month, int day, int hour){
        this.id = id;
        this.good = good;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.amount = amount;
        this.month = month;
        this.day = day;
        this.hour = hour;
    }
    @Override
    public String toString(){
        return id + " " + good + " " + brand + " " + model + " " + size + " " + amount + " " + month + " " + day + " " + hour;
    }
    
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
     * @return the good
     */
    public String getGood() {
        return good;
    }

    /**
     * @param good the good to set
     */
    public void setGood(String good) {
        this.good = good;
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
    
}
