import java.util.Stack;

public class StackProcessor {

    /*
    You are given an integer array, and the task is to process the array using a stack to compute a final result. 
    The stack stores elements while iterating through the array. 
    If the current element is greater than the top of the stack, it is pushed onto the stack. 
    If the current element is smaller, elements are popped from the stack until the top of the stack is smaller than the current element. 
    The popped elements are added to a running total result. 
    After processing all the elements, any remaining values in the stack are also added to result. 
    The goal is to return the final value of result after the entire array is processed.
    */

    public int processStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty() || arr[i] > stack.peek()) {
                stack.push(arr[i]);
            } else {
                while (!stack.isEmpty() && arr[i] < stack.peek()) {
                    result += stack.pop();
                }
                stack.push(arr[i]);
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }

    public static void main(String[] args) {
        StackProcessor processor = new StackProcessor();
        int[] input = {5, 2, 9, 1, 3};
        System.out.println("Final result: " + processor.processStack(input));
    }
}
