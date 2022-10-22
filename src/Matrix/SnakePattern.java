package Matrix;

public class SnakePattern {
    public static void main(String[] args) {

        int matrix [][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        printSnake(matrix);

    }
    static int R=4,C=4;
    static void printSnake(int mat[][]){
        for(int i =0;i<mat.length;i++){
            if(i%2==0){
                for(int j=0;j<mat[0].length;j++){
                    System.out.println(mat[i][j]+" ");
                }
            }
            else{
                for(int j=mat[0].length-1;j>=0;j--){
                    System.out.println(mat[i][j]+" ");
                }
            }
        }
    }

}
