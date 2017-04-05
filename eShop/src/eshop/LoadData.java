/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author deividas
 */
public class LoadData {
    
        //id   item    brand  colour model    size  amount shopsID month day hour
    public static void loadClothesData(ArrayList<Shop> shops) throws FileNotFoundException{
        File clothesFile = new File("./Data/ClothesData.txt");
        Scanner scan = new Scanner(clothesFile);
        String line = scan.nextLine();
        while(scan.hasNextLine()){
            line = scan.nextLine();
            String[] array = line.split("\\s+");
            int id = Integer.parseInt(array[0]);
            int amount = Integer.parseInt(array[6]);
            double price = Double.parseDouble(array[7]);
            int shopsID = Integer.parseInt(array[8]);
            int month = Integer.parseInt(array[9]);
            int day = Integer.parseInt(array[10]);
            int hour = Integer.parseInt(array[11]);
            Clothes item = new Clothes(id,array[1],array[2],array[3],array[4],array[5],amount,price,month,day,hour);
            //System.out.println(item);
            //int i=0;                  //testing purposes
            for(Shop sh:shops){             //check for each shops element if its id equals items id, if true puts item into arraylist in shop element
                if(sh.getId() == shopsID){
                    sh.addClothes(item);
                   // System.out.println(sh.getClothes(i).getItem());   //testing
                    //i++;
                }
            }
        }
    }
        //loads data from file using scannner
    public static void loadShopData(ArrayList<Shop> shops) throws FileNotFoundException{
        File shopFile = new File("./Data/ShopsData.txt");
        Scanner scan = new Scanner(shopFile); // creates scanner
        String line = scan.nextLine(); // scans a first comment line in data file
        while (scan.hasNextLine()){
            line = scan.nextLine(); // while line exists scans and saves into string
            String[] array = line.split("\\s+"); //splits string by " " into string array, \\s+ - ignors all spaces in between
            int id = Integer.parseInt(array[0]); // first element in shop class is shops integer id
            String street = array[2] + " g. " + array[3]; // formats a street name array[2]-st. name array[3]-st. number
            Shop shop = new Shop(id,array[1],street,array[4]); // files shop arraylist
            shops.add(shop); // files array list
            //System.out.println(shops); // testing
        }   
    }
}
