#include <iostream>
#include <stack>
#include <vector>

class StackProcessor {

    /*
        You are given an integer array, and the task is to process the array using a stack to compute a final result. 
        The stack stores elements while iterating through the array. 
        If the current element is greater than the top of the stack, it is pushed onto the stack. 
        If the current element is smaller, elements are popped from the stack until the top of the stack is smaller than the current element. 
        The popped elements are added to a running total result. 
        After processing all the elements, any remaining values in the stack are also added to result. 
        The goal is to return the final value of result after the entire array is processed.
    */

public:
    int processStack(std::vector<int>& arr) {
        std::stack<int> s;
        int result = 0;

        for (int i = 0; i < arr.size(); i++) {
            if (s.empty() || arr[i] > s.top()) {
                s.push(arr[i]);
            } else {
                while (!s.empty() && arr[i] < s.top()) {
                    result += s.top();
                    s.pop();
                }
                s.push(arr[i]);
            }
        }

        while (!s.empty()) {
            result += s.top();
            s.pop();
        }

        return result;
    }
};

int main() {
    StackProcessor processor;
    std::vector<int> input = {5, 2, 9, 1, 3};
    std::cout << "Final result: " << processor.processStack(input) << std::endl;
    return 0;
}
