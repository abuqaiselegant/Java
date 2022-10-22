package Matrix;

public class RotateClockkWise
{
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3},
                {4,5,6},
                {7,8,9}};

        rotate190(arr);
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static int m =3,n =3;
    static void rotate90(int arr[][]){
        int temp[][] = new int[m][n];

        for(int i = 0 ;i<m;i++){
            for(int j = n-1 ; j>=0;j--){
                temp[m-j-1][i]= arr[i][j];
            }
        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = temp[i][j];
            }
        }
    }
    static void rotate190(int arr[][]){
        int temp[][] = new int[m][n];

        for(int i = 0 ;i<m;i++){
            for(int j = 0 ; j<m;j++){
                temp[m-j-1][i]= arr[i][j];
            }
        }
        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                arr[i][j] = temp[i][j];
            }
        }
    }
}
