/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;


import java.io.FileNotFoundException;
import java.util.ArrayList;
/**
 *
 * @author WildsG
 */
public class EShop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        //Creating GUI class and enabling form
        GUI graphicalInterface = new GUI();
        graphicalInterface.setVisible(true);
        ArrayList<Shop> shops = new ArrayList(); // creating shops arraylist
        eshop.LoadData.loadShopData(shops); //currently loads only shops data
        eshop.LoadData.loadClothesData(shops); //loads items into shop class arraylist
        for(Shop sh:shops){ //testing
                System.out.println(sh);
            }
    }
    
    

    
    

    
    
}
