package Refrsher;


////Assignment 2:
//    //Write a program that will accept a 4-digit number (assume that the user enters only 4 digit nos.) and print the sum of all the 4 digits.
//    // For ex: If the number passed is 3629, the program should
//    // print “The sum of all the digits entered is 20”
public class Assignment2 {

    public static void main(String[] args) {
        int ans = sumDigit(4561);
        System.out.println(ans);
        int [] arr = {4,5,9,7,2};
        int ans2 = greatestNum(arr);
        System.out.println(ans2);

        System.out.println(checkPalindrome("malayalam"));
        System.out.println();
    }

    static int sum = 0;
    static int sumDigit(int n){
        while(n>0)
        {int rem = n%10;
        sum +=rem;
        n=n/10;
    }
    return sum;
    }


    //Assignment 3:
    //Write a program to find greatest number in an array
    //

    public static int greatestNum(int[] arr){
        int max = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }

    //Assignment 4:
    //Write a program to check whether the given string is a palindrome or not.
    //[Hint: You have to extract each character from the beginning and end of
    // the String and compare it with each other. String x=” Malayalam”; char c= x.charAt(i) where i is the index]

    static boolean checkPalindrome(String x){
        String temp = x.toLowerCase();
        int start = 0;
        int end = temp.length()-1;
        while(start<= end){
            if(temp.charAt(start)!=temp.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

}

