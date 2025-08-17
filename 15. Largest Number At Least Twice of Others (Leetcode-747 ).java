import java.util.Scanner;
public class Main 
{
    static class Solution 
    {
        public int dominantIndex(int[] nums) 
      {
            int max = -1;
            int smax = -1;
            int maxId = 0;
            for(int i = 0; i < nums.length; i++) 
            {
                if(max < nums[i]) {
                    smax = max;
                    max = nums[i];
                    maxId = i;
                }else if(smax < nums[i]) 
                {
                    smax = nums[i];
                }
            }
            if(smax * 2 <= max) 
            {
                return maxId;
            }else{
                return -1;
            }
        }
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.dominantIndex(nums);
        System.out.println("Output: " + result);
        sc.close();
    }
}
