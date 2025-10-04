import java.util.*;
class Solution
{
    public void rotate(int[][] matrix)
    {
        int n = matrix.length;
        // Transpose the matrix
        for(int i=0; i<n; i++)
        {
            for(int j=i; j<n; j++)
            {
                int k = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = k;
            }
        }
        // Reverse each row
        for(int i=0; i<matrix.length; i++)
        {
            int[] tempArr = matrix[i];
            reverse(tempArr);
        }return;
    }
    public void reverse(int[] arr)
    {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end)
        {
            int k = arr[start];
            arr[start] = arr[end];
            arr[end] = k;
            start++;
            end--;
        }
    }
    // Main method for user input/output
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Input size
        System.out.print("Enter n (size of matrix): ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        // Input matrix
        System.out.println("Enter matrix elements:");
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }
        Solution sol = new Solution();
        sol.rotate(matrix);
        // Output rotated matrix
        System.out.println("Rotated Matrix:");
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }System.out.println();
        }sc.close();
    }
}
