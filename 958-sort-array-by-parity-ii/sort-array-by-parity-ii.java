class Solution {
    public int[] sortArrayByParityII(int[] nums) 
    {
        int n = nums.length;
        int i = 0;
        int j = 1;
        while (i < n && j < n) 
        {
            // If even index has odd number, it's wrong
            if (nums[i] % 2 == 1) 
            {
                // If odd index has even number, it's wrong
                if (nums[j] % 2 == 0) 
                {
                    // swap nums[i] and nums[j]
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i += 2;
                    j += 2;
                } 
                else 
                {
                    // nums[j] is also odd -> j is fine, move to next odd index
                    j += 2;
                }
            } 
            else 
            {
                // nums[i] is even -> i is fine, move to next even index
                i += 2;
            }
        }
        return nums;
        
    }
}