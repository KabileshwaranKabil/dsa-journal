## Running Sum of 1d Array

Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
Example 2:

Input: nums = [1,1,1,1,1]
Output: [1,2,3,4,5]
Explanation: Running sum is obtained as follows: [1, 1+1, 1+1+1, 1+1+1+1, 1+1+1+1+1].
Example 3:

Input: nums = [3,1,2,10,1]
Output: [3,4,6,16,17]
 

Constraints:

1 <= nums.length <= 1000
-10^6 <= nums[i] <= 10^6

# Intuition
Initially, I tried using a single loop, but it didn’t work correctly. So, I decided to use two nested loops to calculate the running sum.

# Approach
1. Create an array runningSum of size n (n is the length of nums).
2. Loop through the array with index i from 0 to n-1
3. Initialize sum = 0 for each i.
4. Loop through the array from j = 0 to i and add nums[j] to sum.
5. Assign runningSum[i] = sum.
6. After the loops, return runningSum.

# Complexity
- Time complexity:
    - Two nested loops give O(n) * O(n) = O(n²)

- Space complexity:
    - O(n) for the runningSum array.

# Code
```java []
class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] runningSum=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=0;j<=i;j++){
                sum+=nums[j];
            }
            runningSum[i]=sum;
        }
        return runningSum;
    }
}
```
