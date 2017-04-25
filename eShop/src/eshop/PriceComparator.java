/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.Comparator;

/**
 *
 * @author deividas
 */
public class PriceComparator implements Comparator {
    
    
    /*public int compare(Accessory x, Object y ){
        
        Accessory yy = (Accessory) y;
        if(x.getPrice() > yy.getPrice())
            return 1;
        else if(x.getPrice() == yy.getPrice())
            return 0;
        else
            return -1;
    }

    public int compare(Clothes x, Object y ){
        
        Clothes yy = (Clothes) y;
        if(x.getPrice() > yy.getPrice())
            return 1;
        else if(x.getPrice() == yy.getPrice())
            return 0;
        else
            return -1;
    }*/
    
    @Override
    public int compare(Object object1, Object object2) {
        Item item1 = (Item) object1;
        Item item2 = (Item) object2;
        if(item1.getPrice() > item2.getPrice())
            return 1;
        else if(item1.getPrice() == item2.getPrice())
            return 0;
        else
            return -1;
    }


    
}
