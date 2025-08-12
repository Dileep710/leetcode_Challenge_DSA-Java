import java.util.*;
public class Solution 
{
    public int removeElement(int[] nums, int val) 
  {
        int ptr = 0;
        for(int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != val) {
                nums[ptr] = nums[i];
                ptr++;
            }
        }
        return ptr;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter value to remove: ");
        int val = sc.nextInt();
        Solution obj = new Solution();
        int newLength = obj.removeElement(nums, val);
        System.out.println("New length of array: " + newLength);
        System.out.print("Array after removal: ");
        for(int i = 0; i < newLength; i++) 
        {
            System.out.print(nums[i] + " ");
        }
    }
}
