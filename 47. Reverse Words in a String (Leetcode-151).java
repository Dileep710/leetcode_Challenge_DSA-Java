import java.util.*;
class Solution
{
    public String reverseWords(String s)
    {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder("");
        for(int i = arr.length - 1; i >= 0; i--)
        {
            sb.append(arr[i] + " ");
        }
        String ans = sb.toString();
        ans = ans.trim();
        return ans;
    }
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        String input = "  the sky   is blue  ";
        String output = sol.reverseWords(input);
        System.out.println("Input: \"" + input + "\"");
        System.out.println("Output: \"" + output + "\"");
    }
}
