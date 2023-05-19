package org.example.array;

public class BubbleSort {
    public static void main(String[] args) {

        int[] intArray = new int[6];
        intArray[0] = 20;
        intArray[1] = -8;
        intArray[2] = 89;
        intArray[3] = 67;
        intArray[4] = 12;
        intArray[5] = 7;

        for(int lastUnsortedIndex = intArray.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i + 1]){
                    swap(intArray, i, i + 1);
                }
            }
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
