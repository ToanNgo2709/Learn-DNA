package org.example;

public class Main {
    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = -8;
        intArray[2] = 89;
        intArray[3] = 67;
        intArray[4] = 12;
        intArray[5] = 7;
        intArray[6] = 60;

        for (int i = 0; i < intArray.length; i++) {
            if(intArray[i] == 7){
                System.out.println("this is seven: " + intArray[i]);
            }
        }

    }
}