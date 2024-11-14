class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

class Solution {
    public ListNode deleteNode(ListNode head, int val) {
        // If the head node itself holds the value to be deleted
        if (head.val == val) {
            return head.next;
        }

        ListNode temp = head;
        while (temp.next != null) {
            if (temp.next.val == val) {
                if (temp.next.next == null) {
                    temp.next = null;
                } else {
                    temp.next = temp.next.next;
                }
                break;
            }
            temp = temp.next;
        }
        return head; // Return the modified list
    }
}

public class DeleteNodeFromLinkedList {
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("NULL");
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        Solution sol = new Solution();
        System.out.print("Original List: ");
        printList(head);

        int valToDelete = 3;
        head = sol.deleteNode(head, valToDelete);

        System.out.print("List after deleting " + valToDelete + ": ");
        printList(head);
    }
}