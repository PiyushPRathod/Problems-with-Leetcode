class Solution {
    public int findDuplicate(int[] nums) 
    {
        Map<Integer, Integer> freq = new HashMap<>();
        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
         int a = -1;

        for(int x = 1; x <= nums.length; x++)
        {
            int c = freq.getOrDefault(x, 0);
            if(c >= 2)
                a = x;
        }        

        return a;
    }
}