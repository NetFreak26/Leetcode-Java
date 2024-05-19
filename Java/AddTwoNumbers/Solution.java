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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode ans = l1;
        int c = 0;

        while (l1.next != null && l2 != null) {
            int sum = l1.val + l2.val + c;
            l1.val = sum % 10;
            c = sum / 10;
            l1 = l1.next;
            l2 = l2.next;
        }

        if (l2 != null) {
            l1.next = l2.next;
            l1.val += l2.val;
        }

        while (l1 != null) {
            int sum = l1.val + c;
            l1.val = sum % 10;
            c = sum / 10;
            if (l1.next == null && c == 1) {
                l1.next = new ListNode(1);
                c = 0;
            }
            l1 = l1.next;
        }
        return ans;
    }
}
