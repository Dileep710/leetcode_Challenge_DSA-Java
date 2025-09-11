import java.util.*;
class Solution
{
    public int findDuplicate(int[] nums)
    {
        int ans = 0;
        for(int i = 0; i < nums.length; i++)
        {
            int ele = nums[i];
            ele = Math.abs(ele);
            if(nums[ele] > 0)
            {
                nums[ele] = -nums[ele];
            }else{
                ans = ele;
                break;
            }
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = Math.abs(nums[i]);
        }return ans;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int duplicate = obj.findDuplicate(nums);
        System.out.println("Duplicate element is: " + duplicate);
        sc.close();
    }
}
