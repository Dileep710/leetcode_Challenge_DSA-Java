import java.util.*;
class Solution
{
    public int searchInsert(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid=(start + end)/2;
            if(nums[mid] == target)
            {
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else
            {
                end = mid - 1;
            }
        }return start;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array in sorted order:");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        Solution solution = new Solution();
        int result = solution.searchInsert(nums, target);
        System.out.println("The target should be inserted at index: " + result);
    }
}
