import java.util.*;
public class Main{
    public static int maximumCount(int[] nums){
        int pos = 0;
        int neg = 0;
        for(int num : nums){
            if(num > 0){
                pos++;
            }else if (num < 0){
                neg++;
            }
        }return Math.max(pos, neg);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();    
        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        int result = maximumCount(nums);
        System.out.println("Maximum count of positive or negative integers: " + result);
        sc.close();
    }
}
