import java.util.*;
class Solution 
{
    public int maxAscendingSum(int[] nums) 
  {
        int max = nums[0];
        int currmax = nums[0];
        for(int i = 1; i < nums.length; i++) 
        {
            if(nums[i - 1] < nums[i])
            {
                currmax = currmax + nums[i];
            }else{
                max = Math.max(max, currmax);
                currmax = nums[i];
            }
        }
        max = Math.max(max, currmax);
        return max;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.maxAscendingSum(nums);
        System.out.println("Maximum Ascending Subarray Sum: " + result);
        sc.close();
    }
}
