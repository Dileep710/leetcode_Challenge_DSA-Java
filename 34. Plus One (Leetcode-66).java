import java.util.*;
class Solution
{
    public int[] plusOne(int[] digits)
    {
        int n = digits.length;
        if(digits[n-1] != 9)
        {
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }
        digits[n-1] = 0;
        for(int i = n - 2; i >= 0; i--)
        {
            if(digits[i] != 9)
            {
                digits[i] = digits[i] + 1;
                return digits;
            }digits[i] = 0;
        }
        int[] ans = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter the digits:");
        for(int i = 0; i < n; i++)
        {
            digits[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int[] result = obj.plusOne(digits);
        System.out.println("Result after adding one:");
        for(int num : result)
        {
            System.out.print(num + " ");
        }
    }
}
