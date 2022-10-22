package Refrsher;

public class CheckPalindrome {

    public static void main(String[] args) {

    }
    public static boolean palindrome(int num){
        int rev=0;int temp = num;
        while(temp >0){
            int rem = temp%10;
            rev = rev*10+rem;
            temp = temp/10;
        }
        if(rev == num){
            return true;
        }
        else {
            return false;
        }
    }
}
