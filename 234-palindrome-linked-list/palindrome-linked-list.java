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
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        if(fast != null) slow = slow.next;
        slow = reverse(slow);
        fast = head;
        while(slow != null){
            if(fast.val != slow.val) return false;
            fast = fast.next;
            slow = slow.next;
        }
        return true;

    }
    public ListNode reverse(ListNode head){
        ListNode cur = head;
        ListNode prev = null;
        while(cur != null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}