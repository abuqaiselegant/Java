package Refrsher;

public class Swap {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 15;


        System.out.println("Before swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


        int temp = num1;
        num1 = num2;
        num2 = temp;


        System.out.println("\nAfter swapping:");
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
    }

}
