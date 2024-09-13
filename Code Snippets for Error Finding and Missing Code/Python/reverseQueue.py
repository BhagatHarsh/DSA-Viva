from queue import Queue

'''
Function	Description
put(element)	Adds an element to the back of the queue.
get()	Removes and returns the front element of the queue.
queue[0] or queue.queue[0] (in deque)	Access the front element of the queue (works with deque).
empty()	Returns True if the queue is empty, otherwise False.
qsize()	Returns the number of elements in the queue.
'''

def reverseQueue(q):
    # Base case: If the queue is empty, return
    if q.empty():
        return

    # Step 1: Dequeue the front element and store it in a variable
    front = q.get()

    # Step 2: Recursively reverse the remaining queue
    # <Your code here>

    # Step 3: Enqueue the stored front element at the rear of the queue
    # <Your code here>

if __name__ == "__main__":
    q = Queue()
    for i in range(1, 6):
        q.put(i)

    reverseQueue(q)

    # Print the reversed queue
    while not q.empty():
        print(q.get(), end=" ")
