/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution
{
    public int sizeLL(ListNode head) {
        int count = 0;
        ListNode curr = head;
        while(curr != null) {
            count++;
            curr = curr.next;
        }return count;
    }
    public ListNode reverseLL(ListNode head) {
        ListNode curr = head;
        ListNode pre = null;
        while(curr != null) {
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }return pre; 
    }
    public int[] nextLargerNodes(ListNode head) {
        int size = sizeLL(head);
        int[] arr = new int[size];

        ListNode nHead = reverseLL(head); 
        Stack<Integer> st = new Stack<>();
        int ptr = size - 1;
        ListNode curr = nHead;

        while(curr != null) {
            int ele = curr.val;
            while(!st.isEmpty() && st.peek() <= ele) {
                st.pop();
            }
            arr[ptr] = st.isEmpty() ? 0 : st.peek();
            st.push(ele);
            curr = curr.next;
            ptr--;
        }return arr;
    }
}
