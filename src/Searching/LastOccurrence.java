package Searching;

public class LastOccurrence {
    public static void main(String[] args) {
        int arr [] ={1,5,8,9,9,9,9};
        System.out.println(lastOcc(arr, 9,0,6));
    }

    static int lastOcc(int arr[], int target, int low , int high){
        int  mid = low +(high-low)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]>target){
            return lastOcc(arr, target, low, mid-1);
        }
        else if (arr[mid]<target){
            return lastOcc(arr, target, mid+1,high);
        }
        else{
            if((mid == arr.length-1)||(arr[mid+1]!=arr[mid])){
                return mid;
            }
            else
                return lastOcc(arr, target,mid+1,high);
        }
    }
}
