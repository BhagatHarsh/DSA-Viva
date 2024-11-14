/*
Problem: Delete a node from a singly linked list.
You are given the head of a singly linked list and a value to delete. Complete the function that removes the node with the given value.

Constraints:
1 <= length of the list <= 1000
-10^4 <= Node.val <= 10^4

Expected Time Complexity: O(n)
*/

#include <iostream>
using namespace std;

struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution
{
public:
    ListNode *deleteNode(ListNode *head, int val)
    {
        // Complete the function
        if (head->val == val)
        {
            return head->next;
        }
        ListNode *temp = head;
        while (temp->next)
        {
            if (temp->next->val == val)
            {
                if (temp->next->next == NULL)
                {
                    temp->next = NULL;
                }
                else
                {
                    temp->next = temp->next->next;
                }
                break;
            }
            temp = temp->next;
        }
        return head; // Return the modified list
    }
};

void printList(ListNode *head)
{
    while (head)
    {
        cout << head->val << " -> ";
        head = head->next;
    }
    cout << "NULL" << endl;
}

int main()
{
    ListNode *head = new ListNode(1);
    head->next = new ListNode(2);
    head->next->next = new ListNode(3);
    head->next->next->next = new ListNode(4);

    Solution sol;
    cout << "Original List: ";
    printList(head);

    int valToDelete = 3;
    head = sol.deleteNode(head, valToDelete);

    cout << "List after deleting " << valToDelete << ": ";
    printList(head);

    return 0;
}
