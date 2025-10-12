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

    public int sizeLL(ListNode head)
    {
        int count = 0;
        ListNode ptr = head;
        while (ptr != null)
        {
            count++;
            ptr = ptr.next;
        }return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB)
    {
        if(headA == null || headB == null)
        {
            return null;
        }
        int s1 = sizeLL(headA);
        int s2 = sizeLL(headB);
        int diff = s1 - s2;
        ListNode ptr1 = headA;
        ListNode ptr2 = headB;
        if(diff > 0)
        {
            while(diff > 0)
            {
                ptr1 = ptr1.next;
                diff--;
            }
        }else{
            while(diff < 0)
            {
                ptr2 = ptr2.next;
                diff++;
            }
        }
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }return ptr1;
    }
    public static ListNode createList(int[] arr)
    {
        if(arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for(int i = 1; i < arr.length; i++)
        {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }return head;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter size of list A: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of list A:");
        for(int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        System.out.print("Enter size of list B: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of list B:");
      
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();

        System.out.print("Enter intersection value (if no intersection, enter -1): ");
        int intersectionVal = sc.nextInt();

        ListNode headA = createList(arr1);
        ListNode headB = createList(arr2);

        if(intersectionVal != -1)
        {
            ListNode tempA = headA, tempB = headB, interNode = null;
            while(tempA != null)
            {
                if(tempA.val == intersectionVal)
                {
                    interNode = tempA;
                    break;
                }tempA = tempA.next;
            }
            if(interNode != null)
            {
                while (tempB.next != null) tempB = tempB.next;
                tempB.next = interNode;
            }
        }
        ListNode intersection = sol.getIntersectionNode(headA, headB);
        if(intersection != null)
        {
            System.out.println("Intersection Node Value: " + intersection.val);
        }else{
            System.out.println("No intersection found.");
        }sc.close();
    }
}
