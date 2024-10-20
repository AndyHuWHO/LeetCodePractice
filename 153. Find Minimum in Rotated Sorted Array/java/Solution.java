package minInRotated.java;

public class Solution {
    public int findMin(int[] nums) {
        int n = nums.length -1;
        if (nums[n]>nums[0]) {return nums[0];}
        return findMinHelper (nums[0], 0, n, nums);
    }

    private int findMinHelper(int first, int left, int right, int[] nums) {
        if (right - left == 0) {
            return nums[left];
        }
        if (right - left == 1) {
            return nums[right] > nums[left]? nums[left] : nums[right];
        }
        int mid = (right - left)/2 + left;
        if (nums[mid] > first) {
            return findMinHelper (first, mid, right, nums);
        } else {
            return findMinHelper (first, left, mid, nums);
        }
    }
    
}
