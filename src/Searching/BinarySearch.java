package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {2,4,6,7,9,22};
        System.out.println(bSearch(arr, 24));
        System.out.println(bSearch(0,arr,0,5));
    }

    static int bSearch(int []arr,int target){
        int n = arr.length;
        int start = 0;
        int end = n-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(arr[mid]== target){
                return mid;
            }
            else if(arr[mid]>target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
    }


    static int bSearch(int target, int arr[], int start, int end){
        int mid = start +(end-start)/2;
        if(start>end){
            return -1;
        }
        if(arr[mid]==target){
            return mid;
        }
        else if (arr[mid]>target){
            return bSearch(target, arr,start, mid-1 );
        }
        else
            return bSearch(target, arr, mid+1, end);
    }


}
