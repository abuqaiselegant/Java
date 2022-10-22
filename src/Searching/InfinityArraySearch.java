package Searching;

public class InfinityArraySearch {
    public static void main(String[] args) {
        int arr [] ={1,4,6,7,8,9,11,12,14,15,17,19,22,25};
        int target = 11;
        int ans = infiSearch(arr, target);
        System.out.println(ans);
    }
    //naive O(x)
    static int infiSearch(int arr[], int x){
        int i = 0;
        while(true){
            if(arr[i]==x){
                return i;
            }
            if(arr[i]>x){
                return -1;
            }
            i++;
        }
    }

    static int search(int arr[], int x){
        if(arr[0]==x){
            return 0;
        }
        int i =1;
        while(arr[i]<x){
            i=i*2;
        }
        if(arr[i]==x){
            return i;
        }
      return binarySearch(arr,x,i/2+1,i-1);
    }
    static int binarySearch(int arr[], int target, int low, int high){

        while(low<=high){
            int mid = low+(high-low)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return -1;
    }
}
