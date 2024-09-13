class StackProcessor:

    '''
    You are given an integer array, and the task is to process the array using a stack to compute a final result. 
    The stack stores elements while iterating through the array. 
    If the current element is greater than the top of the stack, it is pushed onto the stack. 
    If the current element is smaller, elements are popped from the stack until the top of the stack is smaller than the current element. 
    The popped elements are added to a running total result. 
    After processing all the elements, any remaining values in the stack are also added to result. 
    The goal is to return the final value of result after the entire array is processed.
    '''

    def process_stack(self, arr):
        stack = []
        result = 0

        for num in arr:
            if not stack or num > stack[-1]:
                stack.append(num)
            else:
                while stack and num < stack[-1]:
                    result += stack.pop()
                stack.append(num)

        while stack:
            result += stack.pop()

        return result

if __name__ == "__main__":
    processor = StackProcessor()
    input_arr = [5, 2, 9, 1, 3]
    print("Final result:", processor.process_stack(input_arr))
