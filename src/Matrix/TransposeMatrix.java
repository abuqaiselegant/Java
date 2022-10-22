package Matrix;

public class TransposeMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        transpose(arr);
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    // 1  2  3  4
    // 5  6  7  8
    // 9  10 11 12
    // 13 14 15 16
    static int m =4,n =4;
    static void transpose(int matrix[][]){
        int temp[][] = new int[n][m];
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                temp[i][j]= matrix[j][i];
            }
        }

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                matrix[i][j] = temp[i][j];
            }
        }
    }
}
