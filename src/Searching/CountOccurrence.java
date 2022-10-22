package Searching;

public class CountOccurrence {
    public static void main(String[] args) {
    int arr[] = { 1,2,4,5,7,8,8,8,8,9 };
    int target = 8;

        System.out.println(countOcc(arr, target, 0,arr.length-1));
        System.out.println(firstOcc(arr, target, 0, arr.length-1));

        System.out.println(lastOcc(arr, target, 0, arr.length-1));

    }

    static int countOcc(int arr[],int target, int low , int high){
            int first = firstOcc(arr, target,low, high);
            int last = lastOcc(arr, target, low, high);
            if(first == -1){
                return 0;
            }
            else{
                int count = last- first+1;
                return count;
            }
    }

    static int firstOcc(int arr[], int target,int low, int high){
        int mid = low+(high-low)/2;
        if(low>high){
            return -1;
        }
        if(arr[mid]>target){
            return firstOcc(arr, target, low, mid-1 );
        }
        else if(arr[mid]<target){
            return firstOcc(arr, target, mid+1,high);
        }
        else{
            if(mid==0||arr[mid-1]!=arr[mid]){
                return mid;
            }
            else{
                return firstOcc(arr, target,low, mid-1);
            }
        }
    }

    static int lastOcc(int arr[], int target, int low, int high){
        int mid = low+(high-low)/2;

        if(low>high){
            return -1;
        }
        if(arr[mid]>target){
            return lastOcc(arr, target, low,mid-1);
        }
        else if(arr[mid]<target){
            return lastOcc(arr, target,mid+1, high);
        }
        else{
            if(mid==arr.length-1||arr[mid+1]!=arr[mid]){
                return mid;
            }
            else{
                return lastOcc(arr, target, mid+1, high);
            }
        }
    }

}
