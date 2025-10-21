import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
}
public class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode dummy = new ListNode(-1);
        ListNode ans = dummy;
        ListNode curr = head.next;
        int sum = 0;
        while(curr != null) {
            if(curr.val != 0) {
                sum += curr.val;
            }else{
                ListNode temp = new ListNode(sum);
                dummy.next = temp;
                dummy = dummy.next;
                sum = 0;
            }curr = curr.next;
        }return ans.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter linked list elements (end with -1):");
        ListNode dummy = new ListNode(-1);
        ListNode tail = dummy;
        int val = sc.nextInt();
        while(val != -1) {
            tail.next = new ListNode(val);
            tail = tail.next;
            val = sc.nextInt();
        }
        Solution sol = new Solution();
        ListNode result = sol.mergeNodes(dummy.next);
        System.out.println("Merged list:");
        while(result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }sc.close();
    }
}
