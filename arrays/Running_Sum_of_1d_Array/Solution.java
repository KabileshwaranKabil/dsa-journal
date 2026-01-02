// Problem: Running Sum of 1d Array
// LeetCode: https://leetcode.com/problems/running-sum-of-1d-array/
// Difficulty: Easy
// Topic: Arrays , Prefix Sum


package arrays.Running_Sum_of_1d_Array;
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

class Solution2{
    public int[] runningSum(int[] nums) {
        int[] runningSum=new int[nums.length];
        runningSum[0]=nums[0];
        for(int i=1;i<nums.length;i++){
             runningSum[i]=runningSum[i-1]+nums[i];
        }
        return runningSum;
    }
}
