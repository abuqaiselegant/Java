package Array;

public class MajorityElement {
    public static void main(String[] args) {
        int arr[] ={8,3,4,5,8,8,8};
        System.out.println(findMajority(arr));
        System.out.println(findMajority2(arr));
    }

    //find majority element: those element whose occurence is greater than n/2
    //8,3,4,8,8
    //naive:0(N2)
    static int findMajority(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            int count = 1;
            for(int j=1;j<n;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
                if(count>n/2){
                    return i ;
                }
            }
        }
        return -1;
    }

    //efficient
    //Moore's voting algorithm
    static int findMajority2(int arr[]){
        int n = arr.length;
        int res = 0;
        int count =1;
        for(int i =1;i<n;i++){
            if(arr[res] == arr[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res = i;
                count = 1;
            }
        }
        count = 0;
        for(int i = 0;i<n;i++){
            if(arr[res]==arr[i])
                count++;
            }
            if(count<=n/2){
                res = -1;
            }
        return res;
        }
}
