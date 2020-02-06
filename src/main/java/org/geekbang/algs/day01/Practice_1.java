package org.geekbang.algs.day01;

import java.util.HashMap;
import java.util.Map;

/**
 * 1. 两数之和
 * https://leetcode-cn.com/problems/two-sum/
 */
public class Practice_1 {

    public static int[] twoSum(int[] nums, int target) {
        // a + b = target;
        Map<Integer,Integer> cache = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer a = nums[i];
            Integer b = target-nums[i];
            if(cache.containsKey(b)){
                return new int[]{cache.get(b),i};
            }
            cache.put(a,i);
        }
        return new int[]{-1,-1};
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
