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
    public int StartMonth;
    public int StartDay;
    public int StartHour;
    
    public int EndMonth;
    public int EndDay;
    public int EndHour;
    //checking if time was inputted correctly
    public Integer checkTimeInput(String StartDate,String EndDate){
        if(StartDate.substring(2, 3).equals(".") && StartDate.substring(5, 6).equals("."))
        {
            if(EndDate.substring(2, 3).equals(".") && EndDate.substring(5, 6).equals("."))
                return 1;
        }
        return null;
    }
    //setting start date
    public void setStartDate(int month, int day, int hour){
        StartMonth = month;
        StartDay = day;
        StartHour = hour;
    }
    //setting end date
    public void setEndDate(int month, int day, int hour){
        EndMonth = month;
        EndDay = day;
        EndHour = hour;
    }
    
    public int getStartMonth()
    {
        return StartMonth;
    }
    
    public int getStartDay()
    {
        return StartDay;
    }
    
    public int getStartHour()
    {
        return StartHour;
    }
    
    public int getEndMonth()
    {
        return EndMonth;
    }
    
    public int getEndDay()
    {
        return EndDay;
    }
    
    public int getEndHour()
    {
        return EndHour;
    }
    //outputting time for testing purposes
    public void OutputTime()
    {
        System.out.println(StartMonth+" "+StartDay+" "+ StartHour);
         System.out.println(EndMonth+" "+EndDay+" "+ EndHour);
    }
   
}
