import java.util.*;
class Solution
{
    public boolean searchMatrix(int[][] matrix, int target)
    {
        int row = 0;
        int col = matrix[0].length - 1;
        while(row < matrix.length && col >= 0)
        {
            if(matrix[row][col] == target)
            {
                return true;
            }else if(matrix[row][col] > target){
                col--;
            }else
            {
                row++;
            }
        }return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int m = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int n = sc.nextInt();
        int[][] matrix = new int[m][n];
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        // Input target value
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        // Create object and call function
        Solution sol = new Solution();
        boolean result = sol.searchMatrix(matrix, target);
        // Output result
        if(result)
        {
            System.out.println("Target found in matrix.");
        }else{
            System.out.println("Target not found in matrix.");
        }sc.close();
    }
}
