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
    
        public void quickSort(ArrayList arr, Comparator comparator,boolean reverse) {
      
                if (arr.isEmpty()){
                        return;
                }
                sort(arr, 0, arr.size() - 1, comparator,reverse);
        }
        
        /**
         * QuickSort sorting algorithm
         * @param arr ArrayList of object to be sorted
         * @param low index of low object
         * @param high index of high object
         * @param comparator comparator object by which objects will be compared 
         * @param reverse boolean value that suggests if sorting should be used reversed
         */
        private void sort(ArrayList arr, int low, int high, Comparator comparator,boolean reverse) {
                int i = low, j = high;

                Object pivot = arr.get(low + (high-low)/2);
                if(!reverse){
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
                }
                else if(reverse)
                {
                 while (i <= j) {
                        while (comparator.compare(arr.get(i), pivot)>0) {
                                i++;
                        }
                        while (comparator.compare(arr.get(j), pivot)<0) {
                                j--;
                        }
                        if (i <= j) {
                                swap(arr,i, j);
                                i++;
                                j--;
                        }
                }
                }
                if (low < j)
                        sort(arr, low, j,comparator,reverse);
                if (i < high)
                        sort(arr, i, high,comparator,reverse);
        }

        private void swap(ArrayList arr, int i, int j) {
                Object temp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, temp);
        }
}
