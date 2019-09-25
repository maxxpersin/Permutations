package CS353;

import java.util.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    /*
     * @param nums: A list of integers.
     * 
     * @return: A list of permutations.
     */
    public List<List<Integer>> permute(int[] nums) {
        int total = factorial(nums.length);
        List<List<Integer>> result = new ArrayList();
        List<Integer> l = new ArrayList<Integer>();
        if (nums == null) {
            return result;
        } else if (nums.length == 1) {
            l.add(nums[0]);
            result.add(l);
            return result;
        }
        for (int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        result.add(new ArrayList<Integer>(l));
        helper(nums, 0, l, result, total);
        return result;
    }

    private void helper(int[] nums, int idx, List<Integer> l, List<List<Integer>> result, int total) {
        l = new ArrayList<Integer>();
        nums = swap(nums, idx);
        for (int i = 0; i < nums.length; i++) {
            l.add(nums[i]);
        }
        result.add(new ArrayList<Integer>(l));
        idx = idx + 1;
        if (idx == nums.length - 1) {
            idx = 0;
        }
        if (result.size() == total) {
            return;
        }

        if (idx < nums.length) {
            helper(nums, idx, l, result, total);
        }

    }

    private int[] swap(int[] nums, int idx) {
        int temp = nums[idx];
        nums[idx] = nums[idx + 1];
        nums[idx + 1] = temp;
        return nums;
    }

    private int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

}