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
public class NameComparator implements Comparator {
    
    @Override
    public int compare(Object object1, Object object2){
        Item item1 = (Item) object1;
        Item item2 = (Item) object2;
        return item1.getItem().compareTo(item2.getItem());
    }
}
