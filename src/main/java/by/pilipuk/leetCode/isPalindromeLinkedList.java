package by.pilipuk.leetCode;

import java.util.ArrayDeque;
import java.util.Deque;

public class isPalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
        Deque<Integer> stack = new ArrayDeque<>();

        if (head.next == null) {
            return true;
        }

        stack.push(head.val);

        ListNode headFast = head;

        while (headFast.next != null && headFast.next.next != null) {
            head = head.next;
            stack.push(head.val);

            headFast = headFast.next.next;
        }

        head = head.next;

        while (!stack.isEmpty() && stack.peek() == head.val) {
            stack.pop();
            head = head.next;
        }

        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}