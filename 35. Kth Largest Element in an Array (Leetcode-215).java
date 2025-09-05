import java.util.*;
class Solution{
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<nums.length;i++)
        {
            if(pq.size() < k)
            {
                pq.add(nums[i]);
            }else if(pq.peek() < nums[i])
            {
                pq.remove();
                pq.add(nums[i]);
            }
        }return pq.peek();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter element " + (i+1) + ": ");
            nums[i] = scanner.nextInt();
        }
        System.out.println("Enter the value of k:");
        int k = scanner.nextInt();
        Solution solution = new Solution();
        int kthLargest = solution.findKthLargest(nums, k);
        if(kthLargest == Integer.MIN_VALUE){
            System.out.println("No element found in the array that is greater than " + k);
        }else{
            System.out.println("The " + k + "th largest element is: " + kthLargest);
        }
    }
}
