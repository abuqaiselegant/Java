package Array;

import java.util.ArrayList;

public class ArrayOperations {
    public static void main(String[] args) {
        int arr[] = new int[5];
        int cap = 5,n =3;
        arr[0] =5;arr[1] = 4;arr[2]=7;
        int num = 20; int pos=4;
        int ans = insertion(arr,num,n,pos,cap);
        System.out.println(ans);

        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

        int ans5 = deleteEle(arr,arr.length-1,5);
        System.out.println(ans5);
        for(int i =0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    //insertion : 4,5,2,5,1,_,_
    public static int insertion(int arr[], int num,int n, int pos, int cap ){
        int id = pos-1;
        if(n==cap){
            return n;
        }
        for(int i =n-1;i>=id;i--){
            arr[i+1]=arr[i];
        }
        arr[id]=num;
        return n+1;
    }

    public static int deleteEle(int arr[],int n, int x){
        int i ;
        for(i =0;i<=n;i++){
            if(arr[i]== x){
                break;
            }
        }

        if(i==n){
            return n;
        }

        for(int j =i;j<n;j++){
            arr[j]=arr[j+1];
        }
        return n-1;
    }


    }



