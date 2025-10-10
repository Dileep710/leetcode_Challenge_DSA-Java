import java.util.*;
class ListNode
{
    int val;
    ListNode next;
    ListNode() 
    {}
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
    public ListNode reverseLL(ListNode head)
    {
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null)
        {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }return pre;
    }
    public ListNode doubleIt(ListNode head)
    {
        ListNode nhead = reverseLL(head);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int carry = 0;
        while(nhead != null)
        {
            int sum = nhead.val * 2 + carry; // double current node value
            int d = sum % 10;
            carry = sum / 10;
            curr.next = new ListNode(d);
            curr = curr.next;
            nhead = nhead.next;
        }
        if(carry > 0)
        {
            curr.next = new ListNode(carry);
        }return reverseLL(dummy.next);
    }
}
public class Main
{
    public static ListNode createList(int[] arr)
    {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int num : arr)
        {
            curr.next = new ListNode(num);
            curr = curr.next;
        }return dummy.next;
    }
    public static void printList(ListNode head)
    {
        while(head != null)
        {
            System.out.print(head.val);
            if(head.next != null) System.out.print(" -> ");
            head = head.next;
        }System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of nodes: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the list values:");
        for(int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }
        ListNode head = createList(arr);
        Solution sol = new Solution();
        ListNode result = sol.doubleIt(head);
        System.out.print("Doubled Linked List: ");
        printList(result);
    }
}
