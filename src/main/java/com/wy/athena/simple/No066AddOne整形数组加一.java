package com.wy.athena.simple;

/**
 * 描述:
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 *
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 *
 * 输入：digits = [0]
 * 输出：[1]
 *  
 *
 * 提示：
 *
 * 1 <= digits.length <= 100
 * 0 <= digits[i] <= 9
 *
 *
 *
 * 解决思路：从后往前遍历，挨个+1，等于10就continue，不等于10就return，遍历完了还没return的话就是999这样的情况了，new一个新数组1000返回。
 *
 * @author xjh
 * created on 2021-08-09 2:47 下午
 */
public class No066AddOne整形数组加一 {
    public static void main(String[] args) {
        int[] digits = new int[10];
        digits = plusOne(digits);
        System.out.println(digits);
    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len - 1; i >= 0; i--) {
            digits[i]++;
            if (digits[i] == 10) {
                digits[i] = 0;
            }else{
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }

}
















