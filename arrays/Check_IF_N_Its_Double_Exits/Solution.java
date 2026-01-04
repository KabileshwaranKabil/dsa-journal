// Problem: Check If N and Its Double Exist
// LeetCode: https://leetcode.com/problems/check-if-n-and-its-double-exist/
// Difficulty: Easy
// Topic: Arrays


package arrays.Check_IF_N_Its_Double_Exits;
class Solution {
    public boolean checkIfExist(int[] arr) {
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i]==2*arr[j] && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}
