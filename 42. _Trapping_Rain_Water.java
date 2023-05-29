/*

Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.

 

Example 1:


Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:

Input: height = [4,2,0,3,2,5]
Output: 9
 

Constraints:

n == height.length
1 <= n <= 2 * 104
0 <= height[i] <= 105

*/



//Solution


class Solution {
    public int trap(int[] height) {
        return Water(height);
    }


        	public static int Water(int[] arr) {
		int [] left = new int[arr.length];
		left[0] = arr[0];
		for (int i = 1; i < left.length; i++) {
			left[i] = Math.max(left[i-1], arr[i]);
		}
		
		int [] right = new int[arr.length];
		right[arr.length-1] = arr[arr.length-1];
		for (int i = arr.length-2; i >= 0; i--) {
			right[i] = Math.max(right[i+1], arr[i]);
		}
		
		int sum = 0;
		for (int i = 0; i < right.length; i++) {
			sum = sum+Math.min(left[i], right[i])-arr[i];
		}
		return sum;
	}

}
