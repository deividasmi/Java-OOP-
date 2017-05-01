/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.ArrayList;

/**
 *
 * @author deividas
 */
public class Search {
    
    /**
    * Searches for suggestion of similar items for provided one in the stocks and returns them as an ArrayList
    * @param accessories ArrayList of all accessories in the shop
    * @param modelAccessory accessory for which suggestions are looked for
    * @return ArrayList of type Accessory of suggestions for a client of a similar item
    */
    public ArrayList<Accessory> suggestions(ArrayList<Accessory> accessories, Accessory modelAccessory){
        ArrayList<Accessory> newAccessories = new ArrayList();
        for(Accessory ac:accessories){
            if(modelAccessory.getItem().equals(ac.getItem()) && ac.getSize() == modelAccessory.getSize() && ac.getAmount() != 0) 
                newAccessories.add(ac);
        }
        return newAccessories;
    }
    

    public ArrayList<Clothes> suggestions(ArrayList<Clothes> clothes, Clothes modelClothes){
        ArrayList<Clothes> newClothes = new ArrayList();
        for(Clothes cl:clothes){
            if(modelClothes.getItem().equals(cl.getItem()) && modelClothes.getModel().equals(cl.getModel()) && modelClothes.getSize().equals(cl.getSize()) && modelClothes.getType().equals(cl.getType()) && cl.getAmount() != 0)
                newClothes.add(cl);
            }
        return newClothes;
    }
   
}
