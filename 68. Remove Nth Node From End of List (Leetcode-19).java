import java.util.*;
public class Main
{
    public static class ListNode
    {
        int val;
        ListNode next;
        ListNode()
        {}
        ListNode(int val)
        { this.val = val; 
        }
        ListNode(int val, ListNode next)
        { this.val = val; this.next = next;
        }
    }
    static class Solution
    {
        public ListNode removeNthFromEnd(ListNode head, int n)
        {
            if(head == null)
            {
                return null;
            }
            ListNode fast = head;
            ListNode slow = head;
            while(n > 0)
            {
                fast = fast.next;
                n--;
            }
            if(fast == null)
            {
                return head.next;
            }
            while(fast.next != null)
            {
                fast = fast.next;
                slow = slow.next;
            }
            slow.next = slow.next.next;
            return head;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = 5; 
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int removePos = 2;
        Solution sol = new Solution();
        ListNode result = sol.removeNthFromEnd(head, removePos);
        while(result != null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }sc.close();
    }
}
