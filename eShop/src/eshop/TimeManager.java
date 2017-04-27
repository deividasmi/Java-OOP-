/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

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
    //Adds one day to date, also checks if how many days months have for more precise time update.
    public void addDay()
    {
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
