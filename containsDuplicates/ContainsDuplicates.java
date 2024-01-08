package ContainsDuplicates;
import java.util.HashSet;

public class ContainsDuplicates {
    // make use of the HashSet data structure
    public boolean containsDuplicates(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int num: nums) {
            if (hs.contains(num)) {
                return true;
            } else {
                hs.add(num);
            }
        }
        return false;
    }



    public static void main (String[] args) {
        ContainsDuplicates containsDuplicates = new ContainsDuplicates();

        int[] nums1 = {1, 2, 3, 1};
        System.out.println("Contains duplicates in nums1: " + containsDuplicates.containsDuplicates(nums1));

        // Test case 2: Array without duplicates
        int[] nums2 = {4, 5, 6, 7};
        System.out.println("Contains duplicates in nums2: " + containsDuplicates.containsDuplicates(nums2));

        // Test case 3: Empty array
        int[] nums3 = {};
        System.out.println("Contains duplicates in nums3: " + containsDuplicates.containsDuplicates(nums3));

        // Test case 4: Array with multiple duplicates
        int[] nums4 = {1, 2, 3, 1, 4, 2};
        System.out.println("Contains duplicates in nums4: " + containsDuplicates.containsDuplicates(nums4));
        
    }
}
