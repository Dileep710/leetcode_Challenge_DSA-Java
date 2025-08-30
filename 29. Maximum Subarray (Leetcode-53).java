import java.util.*;
public class Main
{
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
        int result = solution.maxSubArray(nums);
        System.out.println(result);
        sc.close();
    }
}
class Solution
{
    public int maxSubArray(int[] nums)
    {
        int currsum = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++)
        {
            if(currsum + nums[i] > nums[i])
            {
                currsum += nums[i];
            }else
            {
                currsum = nums[i];
            }
             max = Math.max(max, currsum);
        }return max;
    }
}
