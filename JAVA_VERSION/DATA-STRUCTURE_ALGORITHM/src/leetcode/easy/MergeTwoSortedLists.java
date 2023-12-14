package leetcode.easy;


import java.util.ArrayList;

/*
https://leetcode.com/problems/merge-two-sorted-lists/
21. Merge Two Sorted Lists
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Example 1:
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]

Example 2:
Input: list1 = [], list2 = []
Output: []

Example 3:
Input: list1 = [], list2 = [0]
Output: [0]

Constraints:

The number of nodes in both lists is in the range [0, 50].
-100 <= Node.val <= 100
Both list1 and list2 are sorted in non-decreasing order.
 */
public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] nums1 = {1,2,4};
        int[] nums2 = {1,3,4};
        ListNode list1 = insert(nums1);
        ListNode list2 = insert(nums2);
        printList(mergeTwoLists(list1, list2)); //[1,1,2,3,4,4]

    }
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a sentinal/dummy node to start
        ListNode returnNode = new ListNode(Integer.MIN_VALUE);
        // Create a copy of this node to iterate while solving the problem
        ListNode headNode = returnNode;

        // Traverse till one of the list reaches the end
        while (l1 != null && l2 != null) {

            // Compare the 2 values of lists
            if (l1.val <= l2.val) {
                returnNode.next = l1;
                l1 = l1.next;
            } else {
                returnNode.next = l2;
                l2 = l2.next;
            }
            returnNode = returnNode.next;
        }

        // Append the remaining list
        if (l1 == null) {
            returnNode.next = l2;
        } else if (l2 == null) {
            returnNode.next = l1;
        }
        // return the next node to sentinal node
        return headNode.next;
    }
    static class ListNode {
        int val;
        ListNode next;
        ListNode() {

        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val; this.next = next;
        }
    }

    public static ListNode insert(int[] nums) {

        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        for(int i: nums) {
            ListNode node = new ListNode(i);
            newNode.next = node;
            newNode = newNode.next;
        }
        return temp.next;

    }
    public static void printList(ListNode node) {
        ArrayList<Integer> arr = new ArrayList();
        while(node != null) {
            arr.add(node.val);
            node = node.next;
        }
        System.out.println(arr);
    }

}
