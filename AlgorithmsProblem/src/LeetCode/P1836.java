package LeetCode;

public class P1836 {/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
//class Solution {
//    public ListNode deleteDuplicatesUnsorted(ListNode head) {
//        Map<Integer, Integer> map = new HashMap<>();
//        ListNode curr = head;
//
//        while (curr != null) {
//            map.put(curr.val, map.getOrDefault(curr.val, 0) + 1);
//            curr = curr.next;
//        }
//
//        ListNode dummy = new ListNode(0);
//        ListNode tail = dummy;
//
//        while (head != null) {
//            if (map.get(head.val) == 1) {
//                tail.next = head;
//                tail = tail.next;
//            }
//
//            head = head.next;
//        }
//
//        tail.next = null;
//        return dummy.next;
//    }
//}
}
