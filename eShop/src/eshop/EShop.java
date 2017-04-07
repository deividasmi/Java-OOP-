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
        ArrayList<Clothes> clothes = new ArrayList(); // creating clothes arraylist
        ArrayList<Accessory> accessories = new ArrayList(); // creating accessories arraylist
        LoadData data = new LoadData();
        data.loadAccessoriesData(accessories); // loads dada into arraylists
        data.loadClothesData(clothes);  // loads clothes data
        for(Clothes cl:clothes){ //testing
                System.out.println(cl);
            }
        System.out.println("----------------------");
        for(Accessory ac:accessories){ //testing
                System.out.println(ac);
            }
    }
    
    

    
    

    
    
}
