class Solution 
{
    public void rotate(int[] nums, int k) 
    {
        // Optimal Solution
        int n = nums.length;
        k = k % n;

        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }

    private void reverse(int[] nums, int left, int right) 
    {
        while (left < right) 
        {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }


        // // Brute force, time limit exceeded
        // k = k % nums.length;
        // for(int i = 0; i < k; i++)
        // {
        //     int j = nums.length - 1;
        //     int temp = nums[j];
        //     while(j > 0)
        //     {
        //         nums[j] = nums[j - 1];
        //         j--;
        //     }
        //     nums[0] = temp;
        // }
}