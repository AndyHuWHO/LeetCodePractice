package twosum.java;

import java.util.Arrays;
import java.util.Random;

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



        int arraySize = 20;
        int minRange = -30;
        int maxRange = 30;
        int target = 17;
        int[] nums = generateRandomArray(arraySize, minRange, maxRange);
        // Print the generated array
        System.out.println("Generated Array: " + Arrays.toString(nums));

 
        // Invoke the twoSum method with the generated array and target
        int[] result = solution.bfTwoSum(nums, target);
 
        // Print the result
        System.out.println("Result: " + Arrays.toString(result));

    }

    private static int[] generateRandomArray(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

}

