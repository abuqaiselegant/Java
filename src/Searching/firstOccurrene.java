package Searching;

public class firstOccurrene {
    public static void main(String[] args) {
    int arr[] ={5,14,14,14,14,14};

        System.out.println(firstOcc(arr,14,0,5 ));

    }
    // using iteration we can find occurrence in O(n) time
    static int firstOcc(int arr[], int target, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low > high) {
            return -1;
        }
        if (arr[mid] > target) {
            return firstOcc(arr, target, low, mid - 1);
        } else if (arr[mid] < target) {
            return firstOcc(arr, target, mid + 1, high);
        } else {
            if (arr[mid] == 0 || arr[mid - 1] != arr[mid]) {
                return mid;
            } else {
                return firstOcc(arr, target, low, mid - 1);
            }
        }
    }
}