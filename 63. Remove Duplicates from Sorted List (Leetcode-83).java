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
    public ListNode deleteDuplicates(ListNode head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }
        ListNode dummy = new ListNode(head.val);
        ListNode ans = dummy;
        ListNode ptr = head.next;
        while(ptr != null){
            if(ptr.val != dummy.val)
            {
                dummy.next = ptr;
                dummy = dummy.next;
            }ptr = ptr.next;
        }dummy.next = null;
        return ans;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Input for linked list
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        if(n == 0)
        {
            System.out.println("Empty list.");
            return;
        }
        System.out.println("Enter " + n + " sorted values (with possible duplicates):");
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for(int i = 1; i < n; i++)
        {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }
        // Process
        Solution sol = new Solution();
        ListNode result = sol.deleteDuplicates(head);
        // Output the modified list
        System.out.println("List after removing duplicates:");
        while(result != null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }sc.close();
    }
}
