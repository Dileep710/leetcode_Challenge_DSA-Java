import java.util.*;
// Definition for singly-linked list.
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if(l1 == null)
        {
            return l2;
        }else if(l2 == null)
        {
            return l1;
        }
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode ptr1 = l1;
        ListNode ptr2 = l2;
        int carry = 0;
        while(ptr1 != null || ptr2 != null)
        {
            int val1 = ptr1 != null ? ptr1.val : 0;
            int val2 = ptr2 != null ? ptr2.val : 0;
            int sum = val1 + val2 + carry;
            int d = sum % 10;
            carry = sum / 10;

            ListNode temp = new ListNode(d);
            dummy.next = temp;
            dummy = dummy.next;
            ptr1 = ptr1 != null ? ptr1.next : null;
            ptr2 = ptr2 != null ? ptr2.next : null;
        }
        if(carry > 0)
        {
            ListNode temp = new ListNode(carry);
            dummy.next = temp;
            dummy = dummy.next;
        }return ans.next;
    }
}
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();
        // Input for first linked list
        System.out.print("Enter number of nodes in first list: ");
        int n1 = sc.nextInt();
        System.out.println("Enter elements of first list:");
        ListNode l1 = null, tail1 = null;
        for(int i = 0; i < n1; i++)
        {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if(l1 == null)
            {
                l1 = node;
                tail1 = node;
            }else{
                tail1.next = node;
                tail1 = node;
            }
        }
        // Input for second linked list
        System.out.print("Enter number of nodes in second list: ");
        int n2 = sc.nextInt();
        System.out.println("Enter elements of second list:");
        ListNode l2 = null, tail2 = null;
        for(int i = 0; i < n2; i++)
        {
            int val = sc.nextInt();
            ListNode node = new ListNode(val);
            if(l2 == null)
            {
                l2 = node;
                tail2 = node;
            }else{
                tail2.next = node;
                tail2 = node;
            }
        }
        // Perform addition
        ListNode result = sol.addTwoNumbers(l1, l2);
        // Output result
        System.out.print("Resultant List: ");
        while(result != null)
        {
            System.out.print(result.val);
            if(result.next != null) {System.out.print(" -> ");}
            result = result.next;
        }System.out.println();
     sc.close();
    }
}
