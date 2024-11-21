
package com.ds_intelligence_arm.utils;

import java.util.Arrays;
import com.ds_intelligence_arm.storage.model.auto_am_DataRecord;

public class SortingAlgorithms {
 /* Implement the bubble, insertion, selection sort which will
  sort descending the array objects based on the price_in_amd. */

    public static auto_am_DataRecord[] auto_am_bubble_sort(auto_am_DataRecord[] my_array){
        int my_array_length = my_array.length;
        for (int i=0; i<my_array_length-1; i++){
            for(int j=0; j<my_array_length-1; j++){
                String current = my_array[j].getPriceInAMD();
                String next = my_array[j+1].getPriceInAMD();
                double cur_price = 0;
                double next_price = 0;
                if (current.equals("")) {
                    cur_price = 0;
                } else {
                    current = current.replace(" ", "").replace("$", "").replace("֏", "");
                    cur_price = Double.parseDouble(current);
                }
                if (next.equals("")) {
                    next_price = 0;
                } else {
                    next = next.replace(" ", "").replace("$", "").replace("֏", "");
                    next_price = Double.parseDouble(next);
                }
                if(cur_price > next_price){
                    auto_am_DataRecord temp = my_array[j];
                    my_array[j]  =  my_array[j+1];
                    my_array[j+1] = temp;
                }
            }
        }

        return my_array;

    }

    public static auto_am_DataRecord[] auto_am_insertion_sort(auto_am_DataRecord[] my_array) {
        int my_array_length = my_array.length;

        for (int i = 1; i < my_array_length; i++) {
            auto_am_DataRecord key = my_array[i];
            String keyPrice = key.getPriceInAMD();
            double keyPriceValue = 0;

            if (!keyPrice.equals("")) {
                keyPrice = keyPrice.replace(" ", "").replace("$", "").replace("֏", "");
                keyPriceValue = Double.parseDouble(keyPrice);
            }

            int j = i - 1;

            while (j >= 0) {
                String currentPrice = my_array[j].getPriceInAMD();
                double currentPriceValue = 0;

                if (!currentPrice.equals("")) {
                    currentPrice = currentPrice.replace(" ", "").replace("$", "").replace("֏", "");
                    currentPriceValue = Double.parseDouble(currentPrice);
                }

                if (currentPriceValue > keyPriceValue) {
                    my_array[j + 1] = my_array[j];
                    j--;
                } else {
                    break;
                }
            }

            my_array[j + 1] = key;
        }

        return my_array;
    }

    public static auto_am_DataRecord[] auto_am_selection_sort(auto_am_DataRecord[] my_array) {
        int my_array_length = my_array.length;

        for (int i = 0; i < my_array_length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < my_array_length; j++) {
                String currentPrice = my_array[j].getPriceInAMD();
                String minPrice = my_array[minIndex].getPriceInAMD();

                double currentPriceValue = 0;
                double minPriceValue = 0;

                if (!currentPrice.equals("")) {
                    currentPrice = currentPrice.replace(" ", "").replace("$", "").replace("֏", "");
                    currentPriceValue = Double.parseDouble(currentPrice);
                }

                if (!minPrice.equals("")) {
                    minPrice = minPrice.replace(" ", "").replace("$", "").replace("֏", "");
                    minPriceValue = Double.parseDouble(minPrice);
                }

                if (currentPriceValue < minPriceValue) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                auto_am_DataRecord temp = my_array[i];
                my_array[i] = my_array[minIndex];
                my_array[minIndex] = temp;
            }
        }

        return my_array;
    }


}

