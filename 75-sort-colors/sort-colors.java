class Solution {
    public void sortColors(int[] nums)
    {
        int low = 0;          // pointer for 0
        int mid = 0;          // pointer for 1
        int high = nums.length - 1; // pointer for 2

        while (mid <= high) 
        {
            if (nums[mid] == 0) 
            {
                // swap nums[mid] and nums[low]
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) 
            {
                mid++; // correct place
            } 
            else 
            { // nums[mid] == 2
                // swap nums[mid] and nums[high]
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }       
    }
}