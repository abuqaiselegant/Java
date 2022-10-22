package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {30,7,5,10};
        reverse(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    //30,7,5,10
    //O(n)
    static void reverse(int arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s<e){
            int temp = arr[e];
            arr[e] = arr[s];
            arr[s] = temp;
            s++;
            e--;
        }
    }
}
