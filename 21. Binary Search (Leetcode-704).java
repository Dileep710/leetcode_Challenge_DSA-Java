import java.util.*;
class Solution 
{
    public int search(int[] nums, int target) 
  {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = (start + end) / 2;
            if(nums[mid] == target) 
            {
                return mid;
            }else if(target > nums[mid]){
                start = mid + 1;
            }else{
                end = mid - 1;
            }
        }return -1;
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements in sorted order:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter target element: ");
        int target = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.search(nums, target);
        if(result != -1) 
        {
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found in the array.");
        }sc.close();
    }
}
