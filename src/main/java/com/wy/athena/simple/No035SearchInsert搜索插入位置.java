package com.wy.athena.simple;

/**
 * 描述:
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-insert-position
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author xjh
 * created on 2021-03-16 3:38 下午
 */
public class No035SearchInsert搜索插入位置 {
    public static void main(String[] args) {
        System.out.println(searchInsertXjh(new int[]{1, 2, 3, 4}, 5));
    }

    /**
     * 二分法
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int left = 0, right = n - 1, ans = n;
        while (left <= right) {
            int mid = ((right - left) >> 1) + left;
            if (target <= nums[mid]) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return ans;
    }

    /**
     * 遍历法
     * @param nums
     * @param target
     * @return
     */
    public static int searchInsertXjh(int[] nums, int target){
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i]>=target) {
                return i;
            }
        }
        return len;
    }

}
