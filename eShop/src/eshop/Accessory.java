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
public class Accessory extends Item {
    
    private int size; 
    private String material;
    
    @Override
    public String toString(){
        return id + " " + item + " " + brand + " " + material + " " + size + " " + amount + " " + price + " " + stockUp;

    }
    
    public Accessory(){}
    
    public Accessory(int id, String item, String brand, String material, int size, int amount, double price, int stockUp){
        this.id = id;
        this.item = item;
        this.brand = brand;
        this.material = material;
        this.size = size;
        this.amount = amount;
        this.price = price;
        this.stockUp = stockUp;
    }
    
    /**
     * @return the Size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the Size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * @return the Material
     */
    public String getMaterial() {
        return material;
    }

    /**
     * @param material
     */
    public void setMaterial(String material) {
        this.material = material;
    }
    
}
