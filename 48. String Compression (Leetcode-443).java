import java.util.*;
public class Solution{
    public int compress(char[] chars)
    {
        int count = 1;
        StringBuilder sb = new StringBuilder("");
        sb.append(chars[0]);
        for(int i = 1; i < chars.length; i++)
        {
            if (chars[i - 1] != chars[i])
            {
                if(count > 1)
                {
                    sb.append(count + "");
                }sb.append(chars[i]);
                count = 1;
            }else{
                count++;
            }
        }
        if(count > 1)
        {
            sb.append(count + "");
        }
        for(int i=0; i < sb.length(); i++){
            char ch = sb.charAt(i);
            chars[i] = ch;
        }return sb.length();
    }
    public static void main(String[] args)
    {
        Solution sol = new Solution();
        char[] chars = {'a','a','b','b','c','c','c'};
        int len = sol.compress(chars);
        System.out.println("Compressed length: " + len);
        System.out.print("Compressed array: ");
        for(int i = 0; i < len; i++)
        {
            System.out.print(chars[i]);
        }
    }
}
