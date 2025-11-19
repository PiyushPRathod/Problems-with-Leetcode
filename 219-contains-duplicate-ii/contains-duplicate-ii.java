class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        // Optimal Solution
         HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            // If value already exists in window → valid duplicate
            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);

            // Maintain window size <= k
            if (set.size() > k) {
                set.remove(nums[i - k]);
            }
        }

        return false;


        // // Brute force solution
        // int n = nums.length;

        // for (int i = 0; i < n; i++) 
        // {
        //     // only check j within k distance
        //     for (int j = i + 1; j <= i + k && j < n; j++) 
        //     {
        //         if (nums[i] == nums[j]) 
        //         {
        //             return true;
        //         }
        //     }
        // }

        // return false;
        
    }
}