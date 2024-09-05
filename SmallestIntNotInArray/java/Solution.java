import java.util.HashSet;

public class Solution {
    public int solution(int[] A) {
        // Implement your solution here
        HashSet<Integer> set = new HashSet<>();
        int smallest = 1;
        int n = A.length;
        for (int i=0; i<n; i++) {
            set.add(A[i]);
        }
        // while (set.contains(smallest)) {
        //     smallest++;
        // }
        // return smallest;
        // Step 3: Use a for loop to check for the smallest missing positive integer
        for (int i = 1; i <= n; i++) {
            if (!set.contains(i)) {
                return i; // Return the smallest missing positive integer
            }
        }
        
        // Step 4: If no number is missing from 1 to A.length, return A.length + 1
        return A.length + 1;

    }


    public int solutionOn(int[] A) {
        int N = A.length;

        // Step 1: Place each number in its correct position if it's in the range [1, N]
        for (int i = 0; i < N; i++) {
            // While the current number is in the valid range [1, N] and not in its correct position
            while (A[i] > 0 && A[i] <= N && A[i] != A[A[i] - 1]) {
                // Swap A[i] with the number at its target position (A[i] - 1)
                int temp = A[A[i] - 1];
                A[A[i] - 1] = A[i];
                A[i] = temp;
            }
        }

        // Step 2: Find the first index where the number is not correct
        for (int i = 0; i < N; i++) {
            if (A[i] != i + 1) {
                return i + 1; // The smallest missing positive integer
            }
        }

        // If all numbers from 1 to N are in place, the smallest missing positive is N + 1
        return N + 1;
    }
}
