package Sorting;

public class intersectionArray {
    public static void main(String[] args) {
        int a[] = {1,5,7,7,7,11,11,12,19};
        int b[] = {1,5,11,12,19,20,20,20};
        intersection2(a, b);
    }
    //without duplicate
    //O(nXm)
    static void intersection(int a[], int b[]){
        int m = a.length-1;
        int n = b.length-1;
        for(int i = 0;i<=m;i++){
            //checking the previous element is same or not
            if(i>0&&a[i]==a[i-1]){
                continue;
            }
            for(int j = 0;j<n;j++){
                if(a[i]==b[j]){
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }

    // works in sorted array

    static void intersection2(int a[], int b[]){
        int m = a.length-1;
        int n = b.length-1;
        // two pointer method of merge sort
        int i = 0;
        int j = 0;
        while(i<=m&&j<=n){
            if(i>0&&a[i]==a[i-1]){
                i++;
                continue;
            }
            if(a[i]<b[j]){
                i++;
            }
            else if(a[i]>b[j]){
                j++;
            }
            else{
                System.out.println(a[i]);
                i++;
                j++;
            }
        }
    }
}
