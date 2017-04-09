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
    public int StartYear = 17;
    public int StartMonth = 1;
    public int StartDay = 1;
    //setting start date
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
    
    
   
}
