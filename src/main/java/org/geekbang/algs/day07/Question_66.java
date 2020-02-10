package org.geekbang.algs.day07;

/**
 * 66. 加一
 * https://leetcode-cn.com/problems/plus-one
 */
public class Question_66 {

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i >=0 ; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i]!=0){ //不用进位
                return digits;
            }
        }
        // 如果程序能跑到这里，说明全部位都进位了，即 999 + 1 = 1000这种情况
        digits = new int[digits.length+1];
        digits[0]=1;
        return digits;
    }

    /**
     * test cases
     *
     * @param args
     */
    public static void main(String[] args) {
        // 123 +1
        int[] digits = {1,2,3};
        int[] result = plusOne(digits);
        System.out.print("123+1 结果：");
        for (int e : result) {
            System.out.print(e);
        }
        System.out.println();

        // 129 + 1
        int[] digits2 = {1,2,9};
        int[] result2 = plusOne(digits2);
        System.out.print("129+1 结果：");
        for (int e : result2) {
            System.out.print(e);
        }
        System.out.println();

        // 999 +1
        int[] digits3 = {9,9,9};
        int[] result3 = plusOne(digits3);
        System.out.print("999+1 结果：");
        for (int e : result3) {
            System.out.print(e);
        }
        System.out.println();


    }
}
