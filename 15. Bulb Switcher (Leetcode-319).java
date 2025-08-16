import java.util.Scanner;
public class Solution 
{
    public int bulbSwitch(int n) 
  {
        int count = 0;
        int i = 1; 
        while(i * i <= n) 
        {
            count++;
            i++;
        }return count;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Solution sol = new Solution();
        System.out.println(sol.bulbSwitch(n));
        sc.close();
    }
}
