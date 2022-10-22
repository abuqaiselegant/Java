package Matrix;

public class JaggedArray {
    public static void main(String[] args) {
     int m =3;//number of rows
     int arr[][]= new int [m][];
     for(int i =0;i<arr.length;i++){
         arr[i] = new int[i+1];//increasing the size of column
         for(int j= 0;j<arr[i].length;j++){
             arr[i][j]=i;
             System.out.print(arr[i][j]+" ");
         }
         System.out.println();
     }
    }

}
