package TwoSum;
public class Main {
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Solution solution = new Solution();

        // Test Case 1
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;
        int[] result1 = solution.hmTwoSum(nums1, target1);
        System.out.println("Test Case 1: " + result1[0] + ", " + result1[1]); // Expected output: 0, 1

        // Test Case 2
        int[] nums2 = {3, 2, 4};
        int target2 = 6;
        int[] result2 = solution.hmTwoSum(nums2, target2);
        System.out.println("Test Case 2: " + result2[0] + ", " + result2[1]); // Expected output: 1, 2

        // Test Case 3
        int[] nums3 = {3, 3};
        int target3 = 6;
        int[] result3 = solution.hmTwoSum(nums3, target3);
        System.out.println("Test Case 3: " + result3[0] + ", " + result3[1]); // Expected output: 0, 1
    }
}

