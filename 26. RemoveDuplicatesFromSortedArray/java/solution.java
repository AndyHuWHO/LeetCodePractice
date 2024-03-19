package 26. RemoveDuplicatesFromSortedArray.java;

public class solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i<nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            } 
        }
        return k;
    }
}
