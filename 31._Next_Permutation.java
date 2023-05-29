/*A permutation of an array of integers is an arrangement of its members into a sequence or linear order.

For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
The next permutation of an array of integers is the next lexicographically greater permutation of its integer. More formally, if all the permutations of the array are sorted in one container according to their lexicographical order, then the next permutation of that array is the permutation that follows it in the sorted container. If such arrangement is not possible, the array must be rearranged as the lowest possible order (i.e., sorted in ascending order).

For example, the next permutation of arr = [1,2,3] is [1,3,2].
Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
While the next permutation of arr = [3,2,1] is [1,2,3] because [3,2,1] does not have a lexicographical larger rearrangement.
Given an array of integers nums, find the next permutation of nums.

The replacement must be in place and use only constant extra memory.

 

Example 1:

Input: nums = [1,2,3]
Output: [1,3,2]
Example 2:

Input: nums = [3,2,1]
Output: [1,2,3]
Example 3:

Input: nums = [1,1,5]
Output: [1,5,1]
 

Constraints:

1 <= nums.length <= 100
0 <= nums[i] <= 100       */



Solution


class Solution {
    public void nextPermutation(int[] nums) {
      Permutation(nums);
        
    }

    private static void Permutation(int[] arr) {
		// TODO Auto-generated method 

		int p = 0;
		int q = 0;
		int n = arr.length;
		for (int i = n-2; i >= 0; i--) {
			if(arr[i]<arr[i+1]) {
				p=i;
				break;
			}
			
		}
		
		for (int i = n-1; i > p; i--) {
			if(arr[i]>arr[p]) {
				q = i;
				break;
			}
		}
		if(p==0&&q==0) {
			Reverse(arr,0,n-1);
			return;
		}
		
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Reverse(arr, p+1,n-1);
		
	}

	private static void Reverse(int[] arr, int i, int j) {
		// TODO Auto-generated method stub
		while(i<j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
	
		}
	}

}	





