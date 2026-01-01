// Problem: Concatenation of Array
// LeetCode: https://leetcode.com/problems/concatenation-of-array/
// Difficulty: Easy
// Topic: Arrays , Simulation

package arrays.Concatenation_of_Array;
class Solution {
    public int[] getConcatenation(int[] nums) {
        int n=nums.length;
        int[] ans= new int[2*n];
        for(int i=0;i<n;i++){
            ans[i]=nums[i];
        }
        for(int i=0;i<n;i++){
            ans[i+n]=nums[i];
        }
        return ans;
    }
}
