/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eshop;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author deividas
 */
public class Sort {
    
    public void quickSort(ArrayList arr, Comparator comparator) {
      
                if (arr.isEmpty()){
                        return;
                }
                sort(arr, 0, arr.size() - 1, comparator);
        }

        private void sort(ArrayList arr, int low, int high, Comparator comparator) {
                int i = low, j = high;

                Object pivot = arr.get(low + (high-low)/2);
           
                while (i <= j) {
                        while (comparator.compare(arr.get(i), pivot)<0) {
                                i++;
                        }
                        while (comparator.compare(arr.get(j), pivot)>0) {
                                j--;
                        }
                        if (i <= j) {
                                swap(arr,i, j);
                                i++;
                                j--;
                        }
                }
                if (low < j)
                        sort(arr, low, j,comparator);
                if (i < high)
                        sort(arr, i, high,comparator);
        }

        private void swap(ArrayList arr, int i, int j) {
                Object temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
        }
}
