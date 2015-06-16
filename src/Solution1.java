import java.util.HashMap;

/**
 * Two Sum
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * The function twoSum should return indices of the two numbers such that they add up to the target,
 * where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * You may assume that each input would have exactly one solution.
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 */
public class Solution1 {

    public final static void main(String[] args) {
        int[] param1 = {7, 11, 2, 15};
        int target = 9;
        Solution1 solution = new Solution1();
        int[] result = solution.twoSum(param1, target);
        System.out.println(result[0] + "," + result[1]);
    }

    private int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> unorderedMap = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            int tmpNum = target - nums[i];
            if(unorderedMap.containsKey(tmpNum)) {
                result[0] = unorderedMap.get(tmpNum) + 1;
                result[1] = i + 1;
                return result;
            }
            unorderedMap.put(nums[i], i);
        }
        return result;
    }

}
