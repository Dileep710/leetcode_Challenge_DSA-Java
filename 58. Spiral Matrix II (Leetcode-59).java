import java.util.Scanner;
public class Solution
{
    public int[][] generateMatrix(int n)
    {
        int[][] arr = new int[n][n];
        int count = 1;
        int minRow = 0;
        int maxRow = n - 1;
        int minCol = 0;
        int maxCol = n - 1;
        while(count <= n * n)
        {
            for(int c = minCol; c <= maxCol; c++)
            {
                arr[minRow][c] = count;
                count++;
            }
            for(int r = minRow + 1; r <= maxRow; r++)
            {
                arr[r][maxCol] = count;
                count++;
            }
            for(int c = maxCol - 1; c >= minCol; c--)
            {
                arr[maxRow][c] = count;
                count++;
            }
            for(int r = maxRow - 1; r >= minRow + 1; r--)
            {
                arr[r][minCol] = count;
                count++;
            }
            minRow++;
            maxRow--;
            minCol++;
            maxCol--;
        }return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        Solution sol = new Solution();
        int[][] result = sol.generateMatrix(n);
        System.out.println("Spiral Matrix:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(result[i][j] + "\t");
            }System.out.println();
        }sc.close();
    }
}
