package arrays.Range_Sum_Query_Immutable;

public class Main {
    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[]{1,1,1,1,1});
        System.out.println("Sum of range (0, 2): " + numArray.sumRange(0, 2));
        System.out.println("Sum of range (1, 3): " + numArray.sumRange(1, 3));
    }
}

