'''
Problem: Delete a node from a singly linked list.
You are given the head of a singly linked list and a value to delete. Complete the function that removes the node with the given value.

Constraints:
1 <= length of the list <= 1000
-10^4 <= Node.val <= 10^4

Expected Time Complexity: O(n)
'''

class ListNode:
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution:
    def deleteNode(self, head, val):
        # If the head node itself holds the value to be deleted
        if head.val == val:
            return head.next
        
        temp = head
        while temp.next:
            if temp.next.val == val:
                if temp.next.next is None:
                    temp.next = None
                else:
                    temp.next = temp.next.next
                break
            temp = temp.next
        return head  # Return the modified list

def printList(head):
    while head:
        print(head.val, end=" -> ")
        head = head.next
    print("NULL")

if __name__ == "__main__":
    head = ListNode(1)
    head.next = ListNode(2)
    head.next.next = ListNode(3)
    head.next.next.next = ListNode(4)

    sol = Solution()
    print("Original List: ", end="")
    printList(head)

    valToDelete = 3
    head = sol.deleteNode(head, valToDelete)

    print(f"List after deleting {valToDelete}: ", end="")
    printList(head)