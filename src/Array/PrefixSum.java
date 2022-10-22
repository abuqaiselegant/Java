package Array;

public class PrefixSum {
    public static void main(String[] args) {
    int arr[] = {2,8,3,9,6,5,4};
        System.out.println(getSum(arr,2,6));

        int ps[] = new int [50];
        ps[0] =arr[0];
        for(int i =1;i<50;i++){
            ps[i]=ps[i-1]+arr[i];
        }
    }

    //O(e-s+1) or O(n)
    static int getSum(int arr[], int s, int e){
        int sum = 0;
        for(int i =s;i<=e;i++){
            sum +=arr[i];
        }
        return sum;
    }

    //effecient
    //preprocessing needed
//    int getSum(int l, int r){
//        if(l==0){
//            return ps[r];
//        }
//        return ps[r]-ps[l-1];
//    }



}
