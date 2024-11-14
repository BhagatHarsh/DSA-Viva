#include <iostream>
#include <queue>

/*
Function	Description
push(element)	Adds an element to the back of the queue.
pop()	Removes the front element of the queue. (Does not return the element.)
front()	Returns a reference to the front element of the queue without removing it.
back()	Returns a reference to the last element of the queue.
empty()	Returns true if the queue is empty, otherwise false.
size()	Returns the number of elements in the queue.
*/
void reverseQueue(std::queue<int>& q) {
    // Base case: If the queue is empty, return
    if (q.empty()) {
        return;
    }

    // Step 1: Dequeue the front element and store it in a variable
    int front = q.front();
    q.pop();

    // Step 2: Recursively reverse the remaining queue
    // <Your code here>

    // Step 3: Enqueue the stored front element at the rear of the queue
    // <Your code here>
}

int main() {
    std::queue<int> q;
    q.push(1);
    q.push(2);
    q.push(3);
    q.push(4);
    q.push(5);

    reverseQueue(q);

    // Print the reversed queue
    while (!q.empty()) {
        std::cout << q.front() << " ";
        q.pop();
    }

    return 0;
}
