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
    
    //returns suggestion array for accessories / suggestions are made by comparing size, return arraylist of accessories of needed size
    public ArrayList<Accessory> accessoriesSuggestions(ArrayList<Accessory> accessories, Accessory modelAccessory){
        ArrayList<Accessory> newAccessories = new ArrayList();
        for(Accessory ac:accessories){
            if(modelAccessory.getItem().equals(ac.getItem()) && ac.getSize() == modelAccessory.getSize() && ac.getAmount() != 0) //checks if sizes are equal and if item is not sold out
                newAccessories.add(ac);
        }
        return newAccessories;
    }
    
    //return suggestion array for clothes / suggestion array is made by comparing clothes by their model, size and type.
    //@modelClothes - is clothes object for witch suggestions are search for;
    public ArrayList<Clothes> clothesSuggestions(ArrayList<Clothes> clothes, Clothes modelClothes){
        ArrayList<Clothes> newClothes = new ArrayList();
        for(Clothes cl:clothes){
            if(modelClothes.getItem().equals(cl.getItem()) && modelClothes.getModel().equals(cl.getModel()) && modelClothes.getSize().equals(cl.getSize()) && modelClothes.getType().equals(cl.getType()) && cl.getAmount() != 0)
                newClothes.add(cl);
            }
        return newClothes;
    }
   
}
