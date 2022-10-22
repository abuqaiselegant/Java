package Matrix;

public class MatrixOperation {

    public static void main(String[] args) {
        int m1[][] = { { 1, 2 },
            { 4, 5 } };
        int m2[][] = { { 5, 6 },
            { 8, 9 } };

        int temp[][] = new int[2][2];

        //addition(m1,m2,temp);
        multiplication(m1, m2, temp);
        for(int i =0;i<2;i++){
            for(int j =0;j<2;j++){
                System.out.print(temp[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static int N =2, M =2;
    public static void addition(int arr1[][] , int arr2[][], int temp[][]){
        for(int i =0;i<N;i++){
            for(int j =0;j<M;j++){
                temp[i][j] = arr1[i][j]+arr2[i][j];

            }
        }
    }

    public static void multiplication(int arr1[][], int arr2[][], int temp[][]){
        for(int i =0;i<M;i++){
            for(int j = 0;j<N;j++){
                temp[i][j] = 0;
               for(int k = 0;k<N;k++){
                   temp[i][j] += arr1[i][k]*arr2[k][j];
               }
            }
        }
    }

}
