package Array;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {5,6,7,9,1,3};
        System.out.println(getLargest(arr));
        System.out.println(secondLargest(arr));
    }
    static int getLargest(int arr[]){
        int res = 0;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[res]){
                res = i;
            }
        }
        return res;
    }
    //10,5,20,8,1
    static int secondLargest(int arr[]){
        int largest = getLargest(arr);
        int res = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i]!=arr[largest]){
                if(res==-1){
                    res =i;
                }
                else if(arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }

    //efficient without given largest
    static int secondLargest2(int arr[]){
        int largest =0;
        int res = -1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res = largest;
                largest = i;

            }
            else if(arr[i]<arr[largest]){
                if(res == -1 || arr[i]>arr[res]){
                    res = i;
                }
            }
        }
        return res;
    }
}
