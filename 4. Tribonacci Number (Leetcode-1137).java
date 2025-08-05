import java.util.Scanner;
public class Solution 
{
    public int tribonacci(int num) 
    {
        if(num == 0) 
        {
            return 0;
        } else if(num == 1 || num == 2) {
            return 1;
        } else {
            int term_1 = 0;
            int term_2 = 1;
            int term_3 = 1;
            for(int i = 1; i <= num; i++) 
            {
                int term_4 = term_1 + term_2 + term_3;
                term_1 = term_2;
                term_2 = term_3;
                term_3 = term_4;
            }return term_1;
        }
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in); 
        Solution solution = new Solution();
        System.out.print("Enter a number (n) to find the nth Tribonacci number: ");
        int n = scanner.nextInt(); 
        int result = solution.tribonacci(n); 
        System.out.println("The " + n + "th Tribonacci number is: " + result); 
        scanner.close(); 
    }
}
