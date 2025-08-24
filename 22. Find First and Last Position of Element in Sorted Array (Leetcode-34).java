import java.util.*;
class Solution
{
    public int[] searchRange(int[] nums, int target)
  {
        int[] ans = {-1, -1};
        if(nums.length == 0)
        {
            return ans;
        }
        ans[0] = firstOccurrence(nums, target);
        ans[1] = lastOccurrence(nums, target);
        return ans;
    }
    public int firstOccurrence(int[] nums, int target)
    {
        int start = 0, end = nums.length - 1, ans = -1;
        while (start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                end = mid - 1; 
            }else if(target > nums[mid])
            {
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }return ans;
    }
    public int lastOccurrence(int[] nums, int target)
  {
        int start = 0, end = nums.length - 1, ans = -1;
        while(start <= end)
        {
            int mid = (start+end)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                start = mid + 1;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }return ans;
    }
    public static void main(String[] args)
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements (sorted): ");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int[] result = sol.searchRange(nums, target);
        System.out.println("First and Last Position: [" + result[0] + ", " + result[1] + "]");
    }
}
