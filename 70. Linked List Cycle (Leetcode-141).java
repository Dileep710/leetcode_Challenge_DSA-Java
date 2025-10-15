import java.util.*;
class ListNode
{
    int val;
    ListNode next;
    ListNode(int x)
    {
        val = x;
        next = null;
    }
}
public class Solution
{
    public boolean hasCycle(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
            {
                return true;
            }
        }return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes: ");
        int n = sc.nextInt();
        if(n <= 0)
        {
            System.out.println("No nodes in the list.");
            return;
        }
        ListNode head = new ListNode(sc.nextInt());
        ListNode temp = head;
        for(int i = 1; i < n; i++)
        {
            temp.next = new ListNode(sc.nextInt());
            temp = temp.next;
        }
        System.out.println("Enter position to create cycle (0 for no cycle): ");
        int pos = sc.nextInt();
        if(pos > 0 && pos <= n)
        {
            ListNode cycleNode = head;
            for(int i = 1; i < pos; i++)
            {
                cycleNode = cycleNode.next;
            }temp.next = cycleNode;
        }

        Solution sol = new Solution();
        boolean result = sol.hasCycle(head);
        System.out.println(result ? "Cycle detected" : "No cycle detected");
    }
}
