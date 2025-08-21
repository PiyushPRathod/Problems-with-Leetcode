class Solution {
    public boolean containsDuplicate(int[] nums) 
    {
        // //used array Sorting solution
        // Arrays.sort(nums);
        // for(int i = 1; i < nums.length; i++)
        // {
        //     if(nums[i] == nums[i - 1])
        //         return true;
        // }
        // return false; 

        //Using Hashset
        HashSet<Integer> s = new HashSet<>();
        for(int i = 0; i < nums.length; i++)
        {
            if(s.contains(nums[i]))
            {
                return true;
            }
             s.add(nums[i]);   
        }
        return false;
    }
}