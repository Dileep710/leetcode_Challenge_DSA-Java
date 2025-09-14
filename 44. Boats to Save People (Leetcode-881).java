import java.util.*;
class Solution
{
    public int numRescueBoats(int[] people, int limit)
    {
        Arrays.sort(people);
        int start = 0;
        int end = people.length - 1;
        int count = 0;
        while(start <= end)
        {
            if(people[start] + people[end] <= limit)
            {
                start++;
                end--;
            }else{
                end--;
            }count++;
        }return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of people: ");
        int n = sc.nextInt();
        int[] people = new int[n];
        System.out.println("Enter the weights of people:");
        for(int i = 0; i < n; i++)
        {
            people[i] = sc.nextInt();
        }
        System.out.print("Enter the boat limit: ");
        int limit = sc.nextInt();
        Solution sol = new Solution();
        int result = sol.numRescueBoats(people, limit);
        System.out.println("Minimum number of boats required: " + result);
        sc.close();
    }
}
