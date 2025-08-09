import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        Solution sol = new Solution();
        int result = sol.maxProduct(nums);
        System.out.println("Maximum product: " + result);
        sc.close();
    }
}
class Solution 
{
    public int maxProduct(int[] nums) 
  {
        int smax = -1;
        int max = -1;
        for (int i = 0; i < nums.length; i++) 
        {
            if (max < nums[i]) 
            {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) 
            {
                smax = nums[i];
            }
        }
        int ans = (max - 1) * (smax - 1);
        return ans;
    }
}
