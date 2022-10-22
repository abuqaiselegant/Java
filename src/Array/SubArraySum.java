package Array;

public class SubArraySum {
    public static void main(String[] args) {

    }
    //naive- O(n2)
    //1,4,20,3,10,5, sum 33
    static boolean subSum(int arr[], int sum){
        for(int i =0;i<arr.length;i++){
            int res = 0;
            for(int j = i;j<arr.length;j++){
                res += arr[j];
                if(res == sum ){
                    return true;
                }
            }
        }
        return false;
    }


    //efficient O(N)
    static boolean subSumSW(int arr[], int sum){
        int curr =0, s =0;
        for(int e =0;e<arr.length;e++){
            curr+=arr[e];
            while(curr>sum){
                curr -= arr[s];
                s++;
            }
            if(curr == sum) {
                return true;
            }
        }
        return false;
    }

}
