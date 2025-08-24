import java.util.*;
class Solution
{
    public int search(int[] nums, int target)
  {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                return mid;
            }else if(nums[start] <= nums[mid])
            {
                if(target >= nums[start] && target < nums[mid])
                {
                    end = mid - 1;
                }else{
                    start = mid + 1;
                }
            }else{
                if(target > nums[mid] && target <= nums[end])
                {
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }
        }return -1;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements (rotated sorted array): ");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target value: ");
        int target = sc.nextInt();
        int result = sol.search(nums, target);
        System.out.println("Index of target: " + result);
    }
}
