class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        // Optimal Solution
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int compliment = target - nums[i];

            if(map.containsKey(compliment))
                return new int[] {map.get(compliment), i};
            
            map.put(nums[i], i);

        }

        return new int[] {};


        // // Brute force
        // int a = 0, b = 0;

        // for(int i = 0; i < nums.length; i++)
        // {
        //     for(int j = i + 1; j < nums.length; j++)
        //     {
        //         if(nums[i] + nums[j] == target)
        //         {
        //             a = i;
        //             b = j;
        //         }
        //     }
        // }

        // return new int[]{a, b};
        
    }
}