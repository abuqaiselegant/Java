package Refrsher;

public class ArrayQues {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        myArray[0] = 10;
        myArray[1] = 20;
        myArray[2] = 30;
        myArray[3] = 40;
        myArray[4] = 50;

        int arraySize = myArray.length;

        int singleValue = myArray[2];

        for (int i = 0; i < arraySize; i++) {
            System.out.println("Value at index " + i + ": " + myArray[i]);
        }
    }
}
