class Solution 
{
    public int maximumDifference(int[] nums) 
    {
        int maximumDifference=-1;
        int diff =0;
        for(int i =0; i<nums.length-1;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i] < nums[j])
                {
                   diff  = nums[j] - nums[i];
                   maximumDifference = Math.max(maximumDifference, diff);
                }
                
            }
        }
        return maximumDifference;
    }
}