import java.util.*;
public class Main 
{
    // Definition for singly-linked list.
    public static class ListNode 
    {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    static class Solution 
    {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) 
        {
            ListNode dummy = new ListNode(-1);
            ListNode ans = dummy;
            ListNode ptr1 = list1;
            ListNode ptr2 = list2;
            while(ptr1 != null && ptr2 != null)
            {
                if(ptr1.val < ptr2.val)
                {
                    dummy.next = ptr1;
                    ptr1 = ptr1.next;
                }else{
                    dummy.next = ptr2;
                    ptr2 = ptr2.next;
                }dummy = dummy.next;
            }
            if(ptr1 == null){
                dummy.next = ptr2;
            }else{
                dummy.next = ptr1;
            }return ans.next;
        }
    }
    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr)
    {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;
        for(int num : arr)
        {
            temp.next = new ListNode(num);
            temp = temp.next;
        }return dummy.next;
    }
    // Helper method to print the linked list
    public static void printList(ListNode head)
    {
        ListNode temp = head;
        while(temp != null)
        {
            System.out.print(temp.val);
            if(temp.next != null) System.out.print(" -> ");
          {
            temp = temp.next;
          }System.out.println();
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // Input for first list
        System.out.print("Enter size of first list: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first sorted list:");
        for(int i = 0; i < n1; i++)
        {
            arr1[i] = sc.nextInt();
        }
        // Input for second list
        System.out.print("Enter size of second list: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second sorted list:");
        for(int i = 0; i < n2; i++)
        {
            arr2[i] = sc.nextInt();
        }
        ListNode list1 = createList(arr1);
        ListNode list2 = createList(arr2);
        Solution sol = new Solution();
        ListNode merged = sol.mergeTwoLists(list1, list2);
        System.out.println("Merged Sorted List:");
        printList(merged);
        sc.close();
    }
}
