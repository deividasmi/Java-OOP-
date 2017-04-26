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
public class ClothesSizeComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        Clothes item1 = (Clothes) o1;
        Clothes item2 = (Clothes) o2;
        return item1.getSize().compareTo(item2.getSize());
    }
    
}
