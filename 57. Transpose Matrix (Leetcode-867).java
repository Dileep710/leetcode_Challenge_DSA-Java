import java.util.*;
class Solution{
    public int[][] transpose(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] ans = new int[col][row];
        for(int i = 0; i < row; i++){
            for (int j = 0; j < col; j++) {
                ans[j][i] = matrix[i][j];
            }
        }return ans;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //Input dimensions
        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();
        //Input matrix
        int[][] matrix = new int[row][col];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        //Call transpose function
        Solution sol = new Solution();
        int[][] result = sol.transpose(matrix);
        //Print transposed matrix
        System.out.println("Transposed Matrix:");
        for(int i = 0; i < result.length; i++){
            for(int j = 0; j < result[0].length; j++){
                System.out.print(result[i][j] + " ");
            }System.out.println();
        }sc.close();
    }
}
