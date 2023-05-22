package org.example.array;

import java.lang.instrument.ClassDefinition;

public class SelectionSort {
    public static void main(String[] args) {

        int[] intArray = new int[6];
        intArray[0] = 20;
        intArray[1] = -8;
        intArray[2] = 89;
        intArray[3] = 67;
        intArray[4] = 12;
        intArray[5] = 7;

        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            int largest = 0;
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            swap(intArray, largest, lastUnsortedIndex);
        }


        for(int item : intArray){
            System.out.println(item);
        }
    }

    private static void swap(int[] array, int i, int j) {
        if (i == j) {
            return;
        } else {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
