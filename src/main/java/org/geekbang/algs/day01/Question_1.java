package org.geekbang.algs.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Question_1 {
    /**
     * 思路：
     * 使用map记录每个遍历过的元素，key是元素值，value是元素下标。
     * 在遍历元素时，从map中取出之前遍历过的元素j，该 key = target - 当前遍历的元素nums[i]
     * 如果从map取出的元素存在，证明：当前遍历元素nums[i] + j = target
     * @param nums
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[]{-1,-1};
        Map<Integer,Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer j = cache.get(target - nums[i]);
            if (j!=null){
                result[0] = j;
                result[1] = i;
            }
            cache.put(nums[i],i);
        }
        return result;
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums,9);
        System.out.println("相加之和为"+target+"的元素的下标："+result[0]+", "+result[1]);
    }
}
