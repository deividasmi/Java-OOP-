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


    
    
    
    /**
    * Loads data from text file into the ArrayList
    * @throws throws file not found exception if file is not in ./Data/ directory
    * @throws Error if the data file is not properly written. E.g. if the last line is empty
    * @param accessories ArrayList of type Accessory in which method puts data for holding
    */
    public void loadAccessoriesData(ArrayList<Accessory> accessories) throws FileNotFoundException{
        
        Scanner scan = new Scanner(accessoriesFile); 
        String line = scan.nextLine(); 
        while (scan.hasNextLine()){
            try{
            line = scan.nextLine(); 
            String[] array = line.split("\\s+"); 
            int id = Integer.parseInt(array[0]);
            int size = Integer.parseInt(array[4]);
            int amount = Integer.parseInt(array[5]);
            double price = Double.parseDouble(array[6]);
            int stockUp = loadStockUp(array[2]);
            Accessory accessory = new Accessory(id,array[1],array[2],array[3],size,amount,price,stockUp); 
            accessories.add(accessory); 
            }catch(Exception e){
                System.out.println("Error: Mistake in data file, please correct it, check if the last line is not empty");
            }
            
            
        }   
    }
    /**
     * Loads data into the ArrayList for keeping
     * @param clothes ArrayList of type Clothes in which the data will be kept
     * @throws FileNotFoundException 
     */
    public void loadClothesData(ArrayList<Clothes> clothes) throws FileNotFoundException{
        Scanner scan = new Scanner(clothesFile);  
        String line = scan.nextLine();
        while(scan.hasNextLine()){
            try{
            line = scan.nextLine();
            String[] array = line.split("\\s+");  
            int id = Integer.parseInt(array[0]);
            int amount = Integer.parseInt(array[6]);
            double price = Double.parseDouble(array[7]);
            int stockUp = loadStockUp(array[2]);
            Clothes item = new Clothes(id,array[1],array[2],array[3],array[4],array[5],amount,price,array[8],stockUp);
            clothes.add(item);
            }catch(Exception e){
                System.out.println("Error: Mistake in data file, please correct it, check if the last line is not empty");
            }
        }
    }
    
    /**
    * Scans the BrandData.txt file to find stockUp value of a brand suggested
    * @param brand the brands name of which stockUp value needs to be returned
    * @return integer value of days it takes for a brand to bring a new batch of goods
    * @throws throws file not found exception if file is not in ./Data/ directory
    * @throws Error if the data file is not properly written. E.g. if the last line is empty
    */
    private int loadStockUp(String brand) throws FileNotFoundException{
        Scanner scan = new Scanner(brandFile);
        String line = scan.nextLine();
        int stockUp = 0;
        while(scan.hasNextLine()){
            try{
            line = scan.nextLine();     
            String[] array = line.split("\\s+");
            stockUp = Integer.parseInt(array[1]); 
            if(array[0].equals(brand)) 
                break;
            }catch(Exception e){
                System.out.println("Error: Mistake in data file, please correct it, check if the last line is not empty");
            }
        }
        return stockUp; 
    }
    
    /**
     * Loads whole History.txt file into the ArrayList of strings
     * @return ArrayList of Strings scanned from history file
     * @throws FileNotFoundException 
     */
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
    /**
     * Loads information from the shopping cart to the History.txt file.
     * @param object ArrayList of objects from the shopping cart
     * @param time  time when the items were bought
     * @param fullPrice total price of all objects in the cart
     * @throws FileNotFoundException
     * @throws IOException 
     */
    public void loadHistoryToFile(ArrayList<Item> object,TimeManager time,double fullPrice) throws FileNotFoundException, IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile,true));  
        writer.append(time.toString());
        writer.newLine();
        writer.append("Price:"+String.format("%.2f",fullPrice)+"€");
        writer.newLine();
        for(Item o:object){
            writer.append(o.toCartString()); 
            writer.newLine();   
        }
        writer.close(); 
    }
    
    
    public void clearHistory() throws IOException{
        BufferedWriter writer = new BufferedWriter(new FileWriter(historyFile));
        writer.newLine(); 
        writer.close();
    }
    
    
    
}
    