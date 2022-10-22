package Sorting;

import java.util.Arrays;

public class UnionArray {
    public static void main(String[] args) {
       int a[] = {1,5,7,8,9,6,8,5};
       int b[] = {2,7,8,9,22,25};
       printUnion(a, b);

    }

    static void printUnion(int a[], int b[]){
        int m = a.length;
        int n = b.length;
        int c[] = new int[m+n];
        for(int i =0;i<m;i++){
            c[i]=a[i];
        }
        for(int j = 0;j<n;j++){
            c[m+j]=b[j];
        }
        Arrays.sort(c);



        for(int i =0;i<c.length;i++){
            System.out.print(c[i]+" ");
        }


        for(int i=0;i<c.length;i++) {
            if (i > 0 && c[i] == c[i - 1]) {
                continue;
            } else {
                System.out.println(c[i]);
            }
        }
    }
    }