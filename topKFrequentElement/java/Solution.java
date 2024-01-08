package topKFrequentElement.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //       // Creating a Frequency Table
        // Map<Integer,Integer> map = new HashMap();
        // for(int n : nums){
        //     map.put(n,map.getOrDefault(n,0) + 1);
        // }
        // // Putting values in priority queue 
        // PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->map.get(b) - map.get(a));
        // pq.addAll(map.keySet());

        // // putting the top k values in array
        // int[] res = new int[k];
        // for(int i = 0;i<k;i++){
        //     res[i] = pq.poll();
        // }
        // return res;

         int[] ans = new int[k];
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Count the frequency of each element
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(frequencyMap.entrySet());
        
        // Sort the list based on the frequency in descending order
        entryList.sort((a, b) -> b.getValue() - a.getValue());
        
        // Retrieve the top k elements
        for (int i = 0; i < k; i++) {
            ans[i] = entryList.get(i).getKey();
        }
        
        return ans;
    }
}
