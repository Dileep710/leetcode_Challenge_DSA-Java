import java.util.*;
class Solution
{
    public int lastStoneWeight(int[] stones)
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : stones)
        {
            pq.add(ele);
        }
        while(pq.size() > 1)
        {
            int max = pq.remove();
            int smax = pq.remove();
            int nstone = max - smax;
            if(nstone != 0)
            {
                pq.add(nstone);
            }
        }
        if(pq.size() == 0)
        {
            return 0;
        }else{
            return pq.remove();
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of stones: ");
        int n = sc.nextInt();
        int[] stones = new int[n];
        System.out.println("Enter the weights of stones:");
        for(int i = 0; i < n; i++)
        {
            stones[i] = sc.nextInt();
        }
        Solution sol = new Solution();
        int result = sol.lastStoneWeight(stones);
        System.out.println("Last Stone Weight: " + result);
        sc.close();
    }
}
