package Recursion;

public class Examples {

    public static void main(String[] args) {
        int ans = sumNDigit(1);
        System.out.println(ans);



        System.out.println(isPalindrome("paap",0,3));
    }

    static int sumNDigit(int N){
        if(N == 0){
            return 0;
        }
        return N+sumNDigit(N-1);
    }


    static boolean isPalindrome(String S, int start, int end){
        if(start>=end){
            return true;
        }
        return isPalindrome(S, start+1,end-1)&&(S.charAt(start)==S.charAt(end));

    }


}
