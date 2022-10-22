package Matrix;

public class printMatrixSnake {
    public static void main(String[] args) {

    }
    static int R = 4,C = 4;
    static void printSnake(int mat[][]){
        for(int i =0;i<R;i++){
            if(i%2==0){
                for(int j = 0;j<C;j++){
                    System.out.println(mat[i][j]+" ");
                }
            }
            else{
                for(int j=C-1;j>=0;j--){
                    System.out.println(mat[i][j]+" ");
                }
            }

        }
    }
}
