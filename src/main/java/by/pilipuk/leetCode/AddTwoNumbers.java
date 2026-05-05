package by.pilipuk.leetCode;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode emptyHead = new ListNode(0);
        ListNode curr = emptyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x;
            if (l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }

            int y;
            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }

            int sum = carry + x + y;
            carry = sum / 10;

            curr.next = new ListNode(sum % 10);
            curr = curr.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return emptyHead.next;
    }

    public static void main(String[] args) {

    }
}