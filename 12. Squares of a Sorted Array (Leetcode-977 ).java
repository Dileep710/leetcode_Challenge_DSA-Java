import java.util.Scanner;
public class Solution 
{
    public int[] sortedSquares(int[] nums) 
  {
        int[] ans = new int[nums.length];
        int start = 0;
        int end = nums.length - 1;
        int ptr = ans.length - 1;
        while (start <= end) {
            int ss = nums[start] * nums[start];
            int es = nums[end] * nums[end];
            if(ss > es) 
            {
                ans[ptr] = ss;
                start++;
            }else{
                ans[ptr] = es;
                end--;
            }
            ptr--;
        }return ans;
    }
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (sorted order):");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int[] result = sol.sortedSquares(nums);
        System.out.println("Sorted Squares Array:");
        for(int val : result) 
        {
            System.out.print(val + " ");
        }
    }
}
