import java.util.*;
public class Main{
    public static class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution{
        public ListNode removeElements(ListNode head, int val) {
            if(head == null) return null;
            ListNode dummy = new ListNode(-1);
            dummy.next = head;
            ListNode curr = dummy;
            while(curr.next != null){
                if(curr.next.val == val){
                    curr.next = curr.next.next;
                }else{
                    curr = curr.next;
                }
            }return dummy.next;
        }
    }
    public static void printList(ListNode head){
        ListNode temp = head;
        while(temp != null){
            System.out.print(temp.val + " ");
            temp = temp.next;
        }System.out.println();
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next.next = new ListNode(6);
        System.out.println("Original List:");
        printList(head);

        Solution solution = new Solution();
        ListNode result = solution.removeElements(head, 6);
        System.out.println("After removing 6:");
        printList(result);
    }
}
