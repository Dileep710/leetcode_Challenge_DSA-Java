import java.util.*;
class Solution
{
    public int singleNonDuplicate(int[] nums)
    {
        if(nums.length == 1)
        {
            return nums[0];
        }else if(nums[0] != nums[1]){
            return nums[0];
         else if(nums[nums.length - 1] != nums[nums.length - 2]){
            return nums[nums.length - 1];
        }
        int start = 0;
        int end = nums.length - 1;
        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid]!=nums[mid - 1] && nums[mid]!=nums[mid + 1])
            {
                return nums[mid];
            }else if(mid%2==1){
                if(nums[mid-1] == nums[mid]){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }
            }else
            {
                if(nums[mid] == nums[mid + 1]){
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
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements: ");
        for(int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.singleNonDuplicate(nums);
        System.out.println("Single non-duplicate element: " + result);
    }
}
