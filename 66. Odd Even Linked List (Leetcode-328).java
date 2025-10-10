import java.util.*;
class ListNode
{
    int val;
    ListNode next;
    ListNode() 
    {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution
{
    public ListNode oddEvenList(ListNode head)
    {
        if(head == null || head.next == null || head.next.next == null)
        {
            return head;
        }
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode evenStart = evenHead;

        while(evenHead != null && evenHead.next != null)
        {
            oddHead.next = oddHead.next.next;
            evenHead.next = evenHead.next.next;
            oddHead = oddHead.next;
            evenHead = evenHead.next;
        }oddHead.next = evenStart;
        return head;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of nodes:");
        int n = sc.nextInt();
        if(n == 0)
        {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Enter the elements:");
        ListNode head = new ListNode(sc.nextInt());
        ListNode current = head;
        for(int i = 1; i < n; i++)
        {
            current.next = new ListNode(sc.nextInt());
            current = current.next;
        }
        Solution sol = new Solution();
        ListNode result = sol.oddEvenList(head);
        System.out.println("Reordered List:");
        while(result != null)
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
