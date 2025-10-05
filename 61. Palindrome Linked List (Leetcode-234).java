import java.util.*;
class ListNode
{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val)
    { 
        this.val = val; 
    }
    ListNode(int val, ListNode next)
    { 
        this.val = val; 
        this.next = next; 
    }
}
class Solution
{
    public boolean isPalindrome(ListNode head)
    {
        Stack<Integer> st = new Stack<>();
        ListNode ptr = head;
        while(ptr != null)
        {
            st.push(ptr.val);
            ptr = ptr.next;
        }
        ListNode ptr2 = head;
        while(ptr2 != null)
        {
            int val1 = ptr2.val;
            int val2 = st.pop();
            if(val1 != val2)
            {
                return false;
            }ptr2 = ptr2.next;
        }return true;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        // Creating a sample linked list: 1 -> 2 -> 2 -> 1
        ListNode n4 = new ListNode(1);
        ListNode n3 = new ListNode(2, n4);
        ListNode n2 = new ListNode(2, n3);
        ListNode n1 = new ListNode(1, n2);
        Solution sol = new Solution();
        boolean result = sol.isPalindrome(n1);
        System.out.println("Is the linked list a palindrome? " + result);
    }
}
