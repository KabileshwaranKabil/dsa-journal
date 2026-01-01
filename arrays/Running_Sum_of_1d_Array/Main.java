package arrays.Running_Sum_of_1d_Array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1,1,1,1,1};
        int[] result = solution.runningSum(nums);
        System.out.println("Input: " + Arrays.toString(nums));
        System.out.println("Running Sum: " + Arrays.toString(result));
    }
}
