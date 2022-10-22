package Searching;

public class TwoPointerSum {
    public static void main(String[] args) {

    }
    static boolean isPair(int arr[], int x){
        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
    //two pointer method
    //O(N)
    static boolean isPair2(int arr[], int x){
        int i =0, j= arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]==x){
                return true;
            }
            else if(arr[i]+arr[j]>x){
                j--;
            }
            else
                i++;
        }
        return false;
    }
}
