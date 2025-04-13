A Monotonic Stack is a data structure that helps maintain elements in a stack in either increasing or decreasing order as they are processed. The term monotonic means that the elements in the stack follow a specific order, either non-increasing or non-decreasing.

Monotonic stacks are often used in problems involving finding the next greater element, next smaller element, or span problems, as they efficiently allow processing of data in O(n) time complexity by eliminating the need for nested loops.

Types of Monotonic Stacks:
Monotonic Increasing Stack:

Maintains elements in increasing order (bottom to top).
Elements are pushed onto the stack if they are greater than the element at the top of the stack.
If an incoming element is smaller, it pops the stack until the element at the top is smaller or the stack is empty.
Monotonic Decreasing Stack:

Maintains elements in decreasing order (bottom to top).
Elements are pushed onto the stack if they are smaller than the element at the top of the stack.
If an incoming element is larger, it pops the stack until the element at the top is larger or the stack is empty.
Key Operations of a Monotonic Stack:
Push: Push elements onto the stack while maintaining the desired order (increasing or decreasing).
Pop: Remove elements from the stack when the new element violates the order.
Peek: Access the element at the top of the stack to check for conditions like the next greater or smaller element.
Why Monotonic Stack is Useful:
It helps in optimizing problems where we need to compare each element with its next or previous elements, such as:

Finding the next greater or next smaller element for each element in an array.
Calculating spans (like stock span problems).
Solving sliding window maximum or minimum problems.
Example 1: Finding the Next Greater Element using a Monotonic Decreasing Stack
Given an array, we want to find the next greater element for each element in the array. If no greater element exists, we return -1 for that element.

Example:

text
Copy code
Input:  [2, 1, 2, 4, 3]
Output: [4, 2, 4, -1, -1]
Approach:
Traverse the array from right to left.
For each element:
Pop the stack while the current element is greater than or equal to the top of the stack (this ensures the stack remains decreasing).
If the stack is not empty, the top of the stack is the next greater element.
Push the current element onto the stack.
Code Implementation in Java:
java
Copy code
public int[] nextGreaterElement(int[] nums) {
int[] result = new int[nums.length];
Stack<Integer> stack = new Stack<>();

    for (int i = nums.length - 1; i >= 0; i--) {
        // Maintain the decreasing order in the stack
        while (!stack.isEmpty() && stack.peek() <= nums[i]) {
            stack.pop();
        }
        
        // If stack is not empty, the next greater element is at the top of the stack
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        
        // Push the current element onto the stack
        stack.push(nums[i]);
    }
    
    return result;
}


Example 2: Finding the Next Smaller Element using a Monotonic Increasing Stack
Given an array, find the next smaller element for each element.

Example:

text
Copy code
Input:  [4, 5, 2, 10, 8]
Output: [2, 2, -1, 8, -1]
Approach:
Traverse the array from right to left.
Use a monotonic increasing stack, and for each element:
Pop the stack until the top is smaller than the current element.
The top of the stack, if not empty, is the next smaller element.
Push the current element to the stack.
Code Implementation in Java:
java
Copy code
public int[] nextSmallerElement(int[] nums) {
int[] result = new int[nums.length];
Stack<Integer> stack = new Stack<>();

    for (int i = nums.length - 1; i >= 0; i--) {
        // Maintain the increasing order in the stack
        while (!stack.isEmpty() && stack.peek() >= nums[i]) {
            stack.pop();
        }
        
        // If stack is not empty, the next smaller element is at the top of the stack
        result[i] = stack.isEmpty() ? -1 : stack.peek();
        
        // Push the current element onto the stack
        stack.push(nums[i]);
    }
    
    return result;
}
Use Cases of Monotonic Stack:
Next Greater Element: Find the first element greater than the current one on its right or left.
Next Smaller Element: Find the first element smaller than the current one on its right or left.


Stock Span Problem: Calculate the number of consecutive days (or prices) where the price of a stock was less than or equal to the current price.
Largest Rectangle in Histogram: Use the monotonic stack to find the largest rectangle area in a histogram.
Sliding Window Maximum/Minimum: Find the maximum or minimum element in every subarray of a given size.
Time Complexity:
The overall time complexity of using a monotonic stack is O(n), where n is the number of elements in the array.
Each element is pushed and popped from the stack at most once, ensuring linear time complexity.
Summary:
A monotonic stack is a powerful tool that helps solve problems where maintaining a specific order of elements is crucial, especially for problems involving next greater or next smaller elements. The key idea is to use the stack to maintain an order (increasing or decreasing) 
to efficiently compare elements without needing nested loops.