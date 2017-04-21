/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author WildsG
 */
public class EShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Creating GUI class and enabling form
        GUI graphicalInterface = new GUI();
        graphicalInterface.setVisible(true);
        ArrayList<Clothes> clothes = new ArrayList(); // creating clothes arraylist
        ArrayList<Accessory> accessories = new ArrayList(); // creating accessories arraylist
        LoadData data = new LoadData();
        data.loadAccessoriesData(accessories); // loads dada into arraylists
        data.loadClothesData(clothes);  // loads clothes data
        graphicalInterface.setItems(accessories, clothes); // sending both arraylists to GUI class
        graphicalInterface.UpdateItemList();
        Search search = new Search();
        ArrayList<Clothes> clothesSuggestions = search.clothesSuggestions(clothes, clothes.get(17));
        for(Clothes cl:clothesSuggestions){ //testing
                System.out.println(cl);
        }
        System.out.println("----------------------");
        ArrayList<Accessory> accessoriesSuggestions = search.accessoriesSuggestions(accessories, accessories.get(9));
        ArrayList<Object> object = new ArrayList();
        for(Accessory ac:accessoriesSuggestions){ //testing
                System.out.println(ac);
                object.add(ac);
                
        }
        data.loadHistoryToFile(object);
      
    }
    
    

    
    

    
    
}
