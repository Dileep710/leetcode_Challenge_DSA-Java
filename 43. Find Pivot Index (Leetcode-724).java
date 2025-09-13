import java.util.*;
class Solution
{
    public int pivotIndex(int[] nums)
    {
        int rsum = 0;
        for(int ele : nums)
        {
            rsum += ele;
        }
        int lsum = 0;
        for(int i = 0; i < nums.length; i++)
        {
            rsum -= nums[i];
            if(rsum==lsum)
            {
                return i;
            }lsum += nums[i];
        }return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int pivot = sol.pivotIndex(nums);
        System.out.println("Pivot Index: " + pivot);
        sc.close();
    }
}
