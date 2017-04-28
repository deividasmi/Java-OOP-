/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author deividas
 */
public class LoadData {
    
    
    private final File accessoriesFile = new File("./Data/AccessoriesData.txt");
    private final File clothesFile = new File("./Data/ClothesData.txt");
    private final File historyFile = new File("./Data/History.txt");
    private final File brandFile = new File("./Data/BrandData.txt");


    
    
    //ID   Item       Brand    Material     Size  Amount Price
    public void loadAccessoriesData(ArrayList<Accessory> accessories) throws FileNotFoundException{
        
        Scanner scan = new Scanner(accessoriesFile); // creates scanner
        String line = scan.nextLine(); // scans a first comment line in data file
        while (scan.hasNextLine()){
            line = scan.nextLine(); // while line exists scans and saves into string
            String[] array = line.split("\\s+"); //splits string by " " into string array, \\s+ - ignors all spaces in between
            int id = Integer.parseInt(array[0]);
            int size = Integer.parseInt(array[4]);
            int amount = Integer.parseInt(array[5]);
            double price = Double.parseDouble(array[6]);
            int stockUp = loadStockUp(array[2]);
            Accessory accessory = new Accessory(id,array[1],array[2],array[3],size,amount,price,stockUp); // puts data into accessory object
            accessories.add(accessory); // adds to array list 
            
        }   
    }
    
        //id   item    brand  colour model    size  amount  
    public void loadClothesData(ArrayList<Clothes> clothes) throws FileNotFoundException{
        Scanner scan = new Scanner(clothesFile);  
        String line = scan.nextLine();
        while(scan.hasNextLine()){
            line = scan.nextLine();
            String[] array = line.split("\\s+");  //explained in detail in the previous function
            int id = Integer.parseInt(array[0]);
            int amount = Integer.parseInt(array[6]);
            double price = Double.parseDouble(array[7]);
            int stockUp = loadStockUp(array[2]);
            Clothes item = new Clothes(id,array[1],array[2],array[3],array[4],array[5],amount,price,array[8],stockUp);
            clothes.add(item);
        }
    }
    //returns the stockUp int number from brand file
    private int loadStockUp(String brand) throws FileNotFoundException{
        Scanner scan = new Scanner(brandFile);
        String line = scan.nextLine();
        int stockUp = 0;
        while(scan.hasNextLine()){
            line = scan.nextLine();     
            String[] array = line.split("\\s+");
            stockUp = Integer.parseInt(array[1]); //saves the int 
            if(array[0].equals(brand)) //if brand is equal to the one given from the clothes or accessories discription when breaks the cycle
                break;
        }
        return stockUp; // returns the save int 
    }
    
    public ArrayList<String> loadHistory() throws FileNotFoundException{
        Scanner scan = new Scanner(historyFile);
        String line;
        ArrayList<String> history = new ArrayList();
        while(scan.hasNextLine()){
            line = scan.nextLine();
            history.add(line);
        }
        return history;
    }
    
    public void loadHistoryToFile(ArrayList<Item> object,TimeManager time,double fullPrice) throws FileNotFoundException, IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile,true)); //creates writer that can write to file // true - enables appending
        writer.append(time.toString());
        writer.newLine();
        writer.append("Price:"+String.format("%.2f",fullPrice)+"€");
        writer.newLine();
        for(Item o:object){
            writer.append(o.toCartString()); //writtes to file
            writer.newLine();   // starts new line
        }
        writer.close(); 
    }
    
    //clears history by creating writer without enabled appending
    public void clearHistory() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile));
        writer.newLine(); //writes empty line
        writer.close();
    }
    
    
    
}
    