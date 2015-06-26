/**
 * #136 Single Number
 * Given an array of integers, every element appears twice except for one. Find that single one.
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 */
public class Solution136 {

    public static final void main(String[] args) {
        int[] case1 = { 10, 10, 30, 5, 30};
        System.out.println(singleNumber(case1));

        int[] case2 = { 1 };
        System.out.println(singleNumber(case2));

        int[] case3 = { 2, 2, 1 };
        System.out.println(singleNumber(case3));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for(int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}
