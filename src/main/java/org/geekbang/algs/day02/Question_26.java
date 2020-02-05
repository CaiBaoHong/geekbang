package org.geekbang.algs.day02;

/**
 * 26. 删除排序数组中的重复项
 * https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array/
 */
public class Question_26 {
    /**
     * 思路：
     * 给定的数组是有序的，初步想法是使用双指针逐个判断
     * 但是我想错了一点，双指针不需要紧紧靠在一起，如：
     * i=0,j=1
     * i=1,j=2
     * i=2,j=3
     * 而需要逆向思维去想，原来是想两个指针挨在一块逐个“找出相同的来处理”，但发现很难处理，
     * 应反过来想，“找不同的来处理”。
     * 那么找到不同之后，有应该怎么处理？如：
     * i   j
     * 1 1 2
     * 可以把数组在逻辑上分成两部分，
     * i指针用来记录“已处理”的部分，即已“删除”重复元素的部分；
     * j指针则记录当前检查到的元素。
     * “找出不同的元素后”，发现j指针已经跳过所有重复的1，此时i指针可以增加一位，
     * 并复制j指针指向的元素，i指针就实现了记录“已处理”部分的功能
     * <p>
     * 要点：
     * 1. 数组是有序的
     * 2. “你不需要考虑数组中超出新长度后面的元素”，题意就是不需要真正做删除，
     * 而是通过覆盖元素实现逻辑上的删除功能，而不是真正的删除某个元素，
     * 真正删除数组某个元素还需要将后续的元素都前移一位，很麻烦
     * 3. 将要处理的数组分成两部分：已处理的，未处理的
     * 4. 两个指针：i指向已处理的部分，j遍历未处理的部分
     *
     * @param nums
     * @return
     */
    public static int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int i = 0;//记录已处理的部分的指针
        // 通过j指针逐个元素检查
        for (int j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                i++;//i指针+1
                nums[i] = nums[j];//通过复制元素覆盖重复值实现“删除重复元素”
            }
        }
        // 返回长度，由于i指针是记录数组中已处理部分的下标，需要+1才是表示“逻辑上”处理后的数组的长度
        return i + 1;
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        // int[] nums = new int[]{1, 1, 2};
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newArrLength = removeDuplicates(nums);
        System.out.println("删除重复元素后的数组：");
        for (int k = 0; k < newArrLength; k++) {
            System.out.print(nums[k] + " ");
        }
    }
}
