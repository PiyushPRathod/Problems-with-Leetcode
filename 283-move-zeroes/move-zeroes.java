class Solution {
    public void moveZeroes(int[] nums) 
    {
        int n = nums.length;
        int j = -1;

        // place j pointer to first 0 in the array
        for(int i=0; i<n; i++)
        {
            if(nums[i] == 0)
            {
                j=i;
                break;
            }
        }

        //return if there are no zeroes in the array
        if(j == -1)
            return;

        //Swap the non zero elements with j pointer so that 0 is shifted to the end of the array
        for(int i=j+1; i<n; i++)
        {
            if(nums[i] != 0)
            {
                int temp;
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

    }
}