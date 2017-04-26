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
public class AccessorySizeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Accessory item1 = (Accessory) o1;
        Accessory item2 = (Accessory) o2;
        if(item1.getSize() > item2.getSize())
            return 1;
        else if(item1.getSize() == item2.getSize())
            return 0;
        else 
            return -1;
    }
    
    
}
