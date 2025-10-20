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
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
    
        ListNode fast = head;
        ListNode slow = head;
        ListNode pre = slow;
        while(fast != null && fast.next != null) {
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }pre.next = pre.next.next;
        return head;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 0) {
            System.out.println("[]");
            return;
        }
        ListNode head = new ListNode(sc.nextInt());
        ListNode curr = head;
        for(int i = 1; i < n; i++) {
            curr.next = new ListNode(sc.nextInt());
            curr = curr.next;
        }sc.close();
        Solution sol = new Solution();
        ListNode result = sol.deleteMiddle(head);
        printList(result);
    }
    public static void printList(ListNode head) {
        ListNode temp = head;
        while(temp != null) {
            System.out.print(temp.val);
            if(temp.next != null) System.out.print(" -> ");
            temp = temp.next;
        }
    }
}
