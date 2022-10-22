package Array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[]  = {10,20,30,30,40,50,50,60,60,60};
        int ans2 = remDeps2(arr);
        for(int i =0;i< ans2;i++){
        System.out.println(arr[i]);
    }
        int ans = remDeps(arr);
        System.out.println(ans);
        for(int i = 0;i<ans;i++){
            System.out.println(arr[i]);
        }


    }
    //10,20,20,30,30,30,30}
    //in a sorted array
    static int remDeps(int arr[]){
        int n= arr.length;
        int temp[] = new int[n];
        temp[0] = arr[0];
        int res =1;
        for(int i =1;i<n;i++){
            if(temp[res-1]!=arr[i]){
                temp[res]= arr[i];
                res++;
            }
        }
        for(int i = 0;i< res ;i++){
            arr[i]=temp[i];
        }

    return res;
    }
    // in a sorted array
    //efficient one TC: O(n); SC: O(1)
    //this just give the index , upto what it is not duplicate
    static int remDeps2(int arr[]){
        int res = 1;
        for(int i =1;i<arr.length;i++){
            if(arr[i]!=arr[res-1]){
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }
}
