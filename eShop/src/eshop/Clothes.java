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



public class Clothes extends Item{
    
    
    private String colour;
    private String size; 
    private String type; 
    private String model; 


 
    public Clothes(){    
    }
    
    public Clothes(int id, String good, String brand, String colour, String model, String size, int amount, double price, String type, int stockUp){
        this.id = id;
        this.item = good;
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.amount = amount;
        this.price = price;
        this.type = type;
        this.stockUp = stockUp;
       
    }
    
   
    @Override
    public String toString(){
        //return id + " " + item + " " + brand + " " + model + " " + type + " " + size + " " + amount + " " + price + " " + stockUp;
        return String.format("%4d %10s %10s %10s %10s %4s %.2f",id,item,brand,model,type,size,price);
    }

   public String toCartString()
   {
        return String.format("%4d %10s %10s %10s %10s %4s %4d %.2f",id,item,brand,model,type,size,cartAmount,price);
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
     * @return the type
     */
    public String getType() {
        return type;
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

 
}
