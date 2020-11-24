package string;
/*
 * Given an array A[] of size N having distinct elements, the task is to find the next greater element for each element of the array in order of their appearance in the array.

Next greater element of an element in the array is the nearest element on the right which is greater than the current element.

If there does not exist next greater of current element, then next greater element for current element is -1. For example, next greater of the last element is always -1.

Example 1:

Input: 
N = 4, arr[] = [1 3 2 4]
Output:
3 4 4 -1
Explanation:
In the array, the next larger element 
to 1 is 3 , 3 is 4 , 2 is 4 and for 4 ? 
since it doesn't exist, it is -1.
Example 2:

Input: 
N = 5, arr[] [6 8 0 1 3]
Output:
8 -1 1 3 -1
Explanation:
In the array, the next larger element to 
6 is 8, for 8 there is no larger elements 
hence it is -1, for 0 it is 1 , for 1 it 
is 3 and then for 3 there is no larger 
element on right and hence -1.
Your Task:
This is a function problem. You only need to complete the function nextLargerElement that takes array and n as parameters and returns an array of length n denoting the next greater elements for all the corresponding elements in the input array.

Expected Time Complexity : O(n)
Expected Auxilliary Space : O(n)

 */

public class nge {
	
	public static long[] nextLargerElement(long[] arr, int n) { 
        Stack<Long> s = new Stack<>();              
        long nge[] = new long[n];                   // Unordered Map to store all the result
        for (int i = n - 1; i >= 0; i--) {          // Run a loop in reverse order
            if (!s.empty()) {                               
                while (!s.empty() && s.peek() < arr[i]) { // If Peek element is less than curr element then it
                    s.pop();                              // can't be the next greater element, so pop it.
                } 
            } 
            nge[i] = s.empty() ? -1 : s.peek();   // If some element exist in stack then the top element is next
            s.push(arr[i]);                       // greater element. Push the current element to stack.
        } 
        // for(int i = 0; i < n; i++) {
        //     System.out.print(nge[i]+" ");
        // }
        return nge;

}
