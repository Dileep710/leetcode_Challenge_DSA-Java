import java.util.Scanner;
class Solution
{
    public int lengthOfLastWord(String s)
    {
        int count = 0;
        for(int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if(ch != ' ')
            {
                count++;
            }else if(count != 0){
                break;
            }
        }return count;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = sc.nextLine();
        Solution sol = new Solution();
        int result = sol.lengthOfLastWord(input);
        System.out.println("Length of last word: " + result);
        sc.close();
    }
}
