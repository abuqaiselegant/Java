package Array;

public class ArrayExample {
    public static void main(String[] args) {

    }
    static int getLargest(int arr[]){
        for(int i =0;i<arr.length;i++){
            boolean flag = true;
            for(int j = 0;j<arr.length;j++) {
                if (arr[j] < arr[j + 1]) {
                    flag = false;
                    break;
                }
            }
            if(flag == true){
                return i;
            }

        }
        return -1;
    }

    static void moveZeroes(int[] arr){
        int n = arr.length-1;
        for(int i =0;i<=n;i++){
            if(arr[i]==0){
                for(int j = i+1;j<n;j++){
                    if(arr[j]!=0){
                        //swap(arr[i],arr[j]);
                    }
                }
            }
        }
    }
    
}
