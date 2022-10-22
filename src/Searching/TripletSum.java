package Searching;

public class TripletSum {
    public static void main(String[] args) {

    }
    //O(N3)
    static boolean isTriplet(int arr[], int sum, int n){
        for(int i = 0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k = j+1;k<n;k++){
                    if(arr[i]+arr[j]+arr[k] == sum){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //O(N2)
    static boolean isPair(int arr[], int n , int x, int si){
        int i = si,j = n-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }
            else if (arr[i]+arr[j]<x){
                i++;
            }
            else
                j--;
        }
        return false;
    }

    static boolean isTriplet2(int arr[], int n, int x){
        for(int i =0; i<n-2;i++){
            if(isPair(arr, n,x-arr[i],i+1)){
                return true;
            }
        }
        return false;
    }

}
