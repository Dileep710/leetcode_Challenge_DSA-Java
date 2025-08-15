import java.util.Scanner;
public class Solution 
{
    public int[] productExceptSelf(int[] nums) 
  {
        int n = nums.length;
        int[] right = new int[n];
        int pro = 1;
        for(int i = n - 1; i >= 0; i--) 
        {
            pro = pro * nums[i];
            right[i] = pro;
        }
        int[] ans = new int[n];
        int left = 1;
        for(int i = 0; i < n - 1; i++) 
        {
            int val = left * right[i + 1];
            ans[i] = val;
            left = left * nums[i];
        }
        ans[n - 1] = left;
        return ans;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution solution = new Solution();
        int[] result = solution.productExceptSelf(nums);
        for(int val : result) 
        {
            System.out.print(val + " ");
        }
        sc.close();
    }
}
