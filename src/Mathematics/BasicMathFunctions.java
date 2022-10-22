package Mathematics;

import java.util.Arrays;

public class BasicMathFunctions {
    public static void main(String[] args) {
//        int ans = countDigits(54200);
//        System.out.println(ans);
//
//        boolean ans2 = palindrome(1452541);
//        System.out.println(ans2);
//
//        int ans3 = TrailingZero(12);
//        System.out.println(ans3);
//
//        int ans4 = Lcm(4,12);
//        System.out.println(ans4);

        boolean a = isPrime(5);
        System.out.println(a);

        Naivesieve(14);
        sieve(18);
    }

    static void sieve(int n){
        if(n<=1)
            return;
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime,true);
        for(int i = 2;i*i<=n;i++){
            if(isPrime[i]){
                for(int j = i*2;j<=n;j=j+i){
                    isPrime[j]= false;
                }
            }
        }
        for(int i = 2;i<=n;i++){
            if(isPrime[i]){
                System.out.println(i+" ");
            }
        }
    }
    //
    public static void Naivesieve(int n){
        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n){
        if(n == 1){
            return false;
        }
        for(int i =2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }


    public static int countDigits(int x){
        int res = 0;
        int temp = x;
        while(temp >0){
            res++;
            temp = temp/10;
        }
        return res;
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

    public static int factorial(int num){
        int res = 1;
        for(int i =2;i<=num;i++){
            res = res*i;
        }
        return res;
    }

    public static int recFactorial(int num){
        if(num ==0){
            return 1;
        }
        return num*recFactorial(num-1);
    }

     public static int TrailingZero(int num){
        int fact =1;
        for(int i =2;i<=num;i++){
            fact = i*fact;
        }
        int res = 0;
        while(fact%10==0){
            res ++;
            fact=fact/10;
        }
        return res;
     }

     //efficient way
    public static int countTrailingZeroes(int n){
        int res = 0;
        for(int i =5;i<=n;i=i*5){
            res = res + n/i;
        }
        return res;
    }

    //hcf
    public static int gcf(int a, int b){
        int res = Math.min(a,b);
        while(res>0){
            if(a%res==0 && b%res==0){
                break;
            }
            res--;

        }
        return res;
    }

    public static int efficientGcd(int a , int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }

    //recursion
    public static int recursiveGcd(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return recursiveGcd(b,a%b);
        }
    }

    //lcm
    public static int Lcm(int a, int b){
        int res = Math.max(a,b);
        while(true){
        if(res%a==0 && res%b ==0){
            return res;
        }
        res++;
        }
    }





}
