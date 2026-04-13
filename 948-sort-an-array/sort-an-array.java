class Solution 
{
    public int[] sortArray(int[] nums) 
    {
        int l = 0;
        int r = nums.length - 1;

        mergeSort(nums, l, r); 

        return nums;       
    }

    public static void mergeSort(int[] nums, int l, int r)
    {
        if(l < r)
        {
            int m = l + (r - l) / 2;

            mergeSort(nums, l, m);
            mergeSort(nums, m + 1, r);

            merge(nums, l, m, r);
        }
    }

    private static void merge(int[] nums, int l, int m, int r)
    {
        int[] temp = new int[r - l + 1];

        int i = l, j = m + 1, k = 0;

        while(i <= m && j <= r)
        {
            if(nums[i] <= nums[j])
            {
                temp[k++] = nums[i++];
            }
            else
            {
                temp[k++] = nums[j++];
            }
        }

        while(i <= m)
        {
            temp[k++] = nums[i++];
        }

        while(j <= r)
        {
            temp[k++] = nums[j++];
        }

        for(int x = 0; x < temp.length; x++)
        {
            nums[l + x] = temp[x];
        }
    }
}