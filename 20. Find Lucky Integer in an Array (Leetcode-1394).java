import java.util.*;
public class Solution 
{
    public int findLucky(int[] arr) 
  {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int ele = arr[i];
            if(hm.containsKey(ele)) 
            {
                hm.put(ele, hm.get(ele) + 1);
            }else{
                hm.put(ele, 1);
            }
        }
        int ans = -1;
        for(int key : hm.keySet()) 
        {
            if (hm.get(key) == key) 
            {
                ans = Math.max(ans, key);
            }
        }return ans;
    }
    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }
        Solution obj = new Solution();
        int result = obj.findLucky(arr);
        System.out.println("Lucky Integer: " + result);
        sc.close();
    }
}
