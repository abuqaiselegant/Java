package Array;

public class MaximumSumSW {
    public static void main(String[] args) {
        int arr[] = {1,8,30,-5,20,7};
        System.out.println(maxKSum(arr,3));
        System.out.println(1+3);
        int a[] = new int[25];
    }
    //1,8,30,-5,20,7
    //k=3
    //45

    //naive
     static int maxiSum(int arr[],int k){
        int res = Integer.MIN_VALUE;
        for(int i = 0;i+k-1<arr.length;i++){
            int sum = arr[i];
            for(int j = 1;j<k;j++){
                sum+=arr[i+j];
            }
            res = Math.max(sum, res);
        }
        return res;
    }


    //windowSlidingWindow-(N)
    static int maxKSum(int arr[], int k){
        int curr= 0;
        for(int i = 0;i<k;i++){
            curr+=arr[i];
        }
        int res = curr;
        for(int j= k;j< arr.length;j++){
            curr=curr+arr[j]-arr[j-k];
            res = Math.max(res,curr);
        }
        return res;
    }
}
