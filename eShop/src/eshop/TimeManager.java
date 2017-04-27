/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.ArrayList;

/**
 *
 * @author WildsG
 */


public class TimeManager {
   //public class variables
    //setting default date
    public int StartYear = 2017;
    public int StartMonth = 4;
    public int StartDay = 15;
    
    private int totalDays = 0;
    
    //setting start date
    @Override
    public String toString()
    {
        return "Date: "+StartYear+"/"+StartMonth+"/"+StartDay;
    }
    
    public void setStartDate(int year, int month, int day){
        StartYear = year;
        StartMonth = month;
        StartDay = day;
    }
    public int getStartYear()
    {
        return StartYear;
    }
    
    public int getStartMonth()
    {
        return StartMonth;
    }
    
    public int getStartDay()
    {
        return StartDay;
    }

    //updates stocks for all the items
    public void updateStocks(ArrayList<Clothes> clothes, ArrayList<Accessory> accessories){
        for(Clothes cl:clothes)
            addStocks(cl);
        for(Accessory ac:accessories)
            addStocks(ac);
    }
    //adds to stocks if it is a stock up day    
    public void addStocks(Item item){
        if(totalDays > item.getStockUp() && totalDays % item.getStockUp() == 0){
            int newAmount;
            newAmount = item.getAmount() + 10;
            item.setAmount(newAmount);
        }
    }
    //checks if the its 3 days from stock up
    public boolean checkIfDiscount(Item item){
        boolean discountDay = false;
        if(daysTillStockUp(item) == 3)
            discountDay = true;
        return discountDay;
    }
    //checks if there are no item in the stocks and returns the how many days left till the next stockup;
    public int daysTillStockUp(Item item){
        int leftDays = 0;
        if(item.getAmount() != 0){
            if(totalDays < item.getStockUp()){
                leftDays = item.getStockUp() - totalDays;
            }else 
                leftDays = item.getStockUp() - (totalDays % item.getStockUp());
        }
        return leftDays;
    }
    
    //returns new price with a discount if it is a discount day
    public double discountedPrice(Item item){
        double newPrice = 0;
        if(checkIfDiscount(item))
            newPrice = item.getPrice() / 2;
        return newPrice;
    }
    
    //Adds one day to date, also checks if how many days months have for more precise time update.
    public void addDay()
    {
        totalDays++;
        StartDay++;
        switch (StartMonth) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(StartDay>31)
                {
                    StartDay-=31;
                    StartMonth++;
                }   break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(StartDay>30)
                {
                    StartDay-=30;
                    StartMonth++;
                }   break;
            case 2:
                if(StartYear%400==0||(StartYear%100!=0 &&StartYear%4==0))
                {
                    if(StartDay>29)
                    {
                        StartDay-=29;
                        StartMonth++;
                    }      
                }
                else
                {
                    if(StartDay>28)
                    {
                        StartDay-=28;
                        StartMonth++;
                    }  
                }
                break;
            default:
                break;
        }
        if(StartMonth>12)
        {
            StartMonth-=12;
            StartYear++;
        }
        
    }
    
   
}
