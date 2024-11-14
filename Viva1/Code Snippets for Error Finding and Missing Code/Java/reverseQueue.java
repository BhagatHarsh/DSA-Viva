import java.util.LinkedList;
import java.util.Queue;

/*
Function	Description
add(element)	Inserts an element into the queue (throws exception if the queue is full).
offer(element)	Inserts an element into the queue (returns false if the queue is full).
poll()	Retrieves and removes the front element of the queue, returns null if the queue is empty.
remove()	Retrieves and removes the front element, throws exception if the queue is empty.
peek()	Retrieves the front element without removing it, returns null if the queue is empty.
element()	Retrieves the front element without removing it, throws exception if the queue is empty.
isEmpty()	Returns true if the queue is empty, otherwise false.
size()	Returns the number of elements in the queue.
*/

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> q) {
        // Base case: If the queue is empty, return
        if (q.isEmpty()) {
            return;
        }

        // Step 1: Dequeue the front element and store it in a variable
        int front = q.poll();

        // Step 2: Recursively reverse the remaining queue
        // <Your code here>

        // Step 3: Enqueue the stored front element at the rear of the queue
        // <Your code here>
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        reverseQueue(q);

        // Print the reversed queue
        while (!q.isEmpty()) {
            System.out.print(q.poll() + " ");
        }
    }
}
