package Array;

public class SortedArray {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1};

        System.out.println(checkSorting(arr));
    }

    //it is for inreasing oreder,
    // if needed for decreasing use if condition
    static boolean checkSorting(int arr[]){
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
