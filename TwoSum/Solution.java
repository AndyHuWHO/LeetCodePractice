package TwoSum;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Solution {
    //brute force solution
    public int[] bfTwoSum(int[] nums, int target) {
        int n = nums.length;
        int[] result = new int[2];
        for (int i=0; i<n; i++) {
            for (int j = i+1; j<n; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return new int[0];
    }


    //hashMap solution
    public int[] hmTwoSum(int[] nums, int target) {
        int n = nums.length;
        int [] result = new int[2];
        Map<Integer, Integer> map = new HashMap<> ();
        for (int i=0; i<n; i++) {
            int complement = target - nums[i];
            // if there's a previous int in the array that is the completment of the current int
            if (map.containsKey(complement)) {
                result[1] = i;
                result[0] = map.get(complement);
                return result;
            }
            //put each int as key into the map, with its index as value, until an answer if found 
            map.put(nums[i], i);
        }
        return new int[] {-1, -1};
    }



    //two pointer sort array solution
    public int[] tpTwoSum (int[] nums, int target) {
        int[] result = new int[2];
        int[] sortedNums = nums.clone();
        Arrays.sort(sortedNums);

        int left = 0;
        int n = nums.length;
        int right = n - 1;

        while (left < right) {
            int sum = sortedNums[left] + sortedNums[right];
            if(sum == target) {
                break;
            } else if (sum < target) {
                left ++;
            } else if (sum > target) {
                right --;
            }
        }

        for (int i=0; i<n; i++) {
            if (nums[i] == sortedNums[left]) {
                result[0] = i;
                break;
            }
        }
        for (int i=n; i>0; i--) {
            if (nums[i] == sortedNums[right]) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}