import java.util.*;
public class Main 
{
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] num = new int[n];
        System.out.print("Enter the array elements: ");
        for (int i = 0; i < n; i++) 
        {
            num[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();
        Solution sol = new Solution();
        List<Integer> result = sol.addToArrayForm(num, k);
        System.out.print("Result: ");
        for (int val : result) 
        {
            System.out.print(val + " ");
        }
        System.out.println();
        sc.close();
    }
}
class Solution 
{
    public List<Integer> addToArrayForm(int[] num, int k) 
  {
        List<Integer> ans = new ArrayList<>();
        int p = num.length - 1;
        int carry = 0;
        while (p >= 0 || k > 0 || carry > 0) 
        {
            int numVal = (p >= 0) ? num[p] : 0;
            int d = k % 10;
            int sum = numVal + d + carry;
            ans.add(sum % 10);
            carry = sum / 10;
            p--;
            k = k / 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}
