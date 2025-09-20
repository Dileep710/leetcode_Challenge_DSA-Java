import java.util.*;
class Solution
{
    public String decodeString(String s)
  {
        Stack<Integer> num = new Stack<>();
        Stack<StringBuilder> str = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;
        for(char c : s.toCharArray())
        {
            if(Character.isDigit(c)){
                n = n * 10 + (c - '0');
            } 
            else if(c == '[')
            {
                num.push(n);
                n = 0;
                str.push(sb);
                sb = new StringBuilder();
            } 
            else if(c == ']') 
            {
                int k = num.pop();
                StringBuilder temp = sb;
                sb = str.pop();
                while (k-- > 0) {
                    sb.append(temp);
                }
            } 
            else 
            {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args)
    {
        Solution sol = new Solution();
        String s1 = "3[a]2[bc]";
        String s2 = "3[a2[c]]";
        String s3 = "2[abc]3[cd]ef";
        System.out.println(sol.decodeString(s1));
        System.out.println(sol.decodeString(s2)); 
        System.out.println(sol.decodeString(s3));
    }
}
