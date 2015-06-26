import java.util.HashMap;

/**
 * #217 Contains Duplicate
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array,
 * and it should return false if every element is distinct.
 */
public class Solution217 {

    public static final void main(String[] args) {
        int[] case1 = {1, 2, 3, 4, 5};
        int[] case2 = {-1, 2, 2, 3, 1};

        System.out.println(containsDuplicate(case1));
        System.out.println(containsDuplicate(case2));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i])) {
                return true;
            }
            map.put(nums[i], 1);
        }
        return false;
    }

}
