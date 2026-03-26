class Solution {
    public List<List<Integer>> threeSum(int[] nums) 
    {
        // Optimal solution
        int n = nums.length;

        Set<List<Integer>> resSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            Set<Integer> s = new HashSet<>();

            for (int j = i + 1; j < n; j++) {
                int complement = -(nums[i] + nums[j]);

                if (s.contains(complement)) {
                    List<Integer> curr = Arrays.asList(nums[i], nums[j], complement);
                    Collections.sort(curr);
                    resSet.add(curr);
                }

                s.add(nums[j]);
            }
        }

        return new ArrayList<>(resSet);


        // // Brute force (time limit exceeded)
        // List<List<Integer>> res = new ArrayList<>();

        // for(int i = 0; i < nums.length - 2; i++)
        // {
        //     for(int j = i + 1; j < nums.length - 1; j++)
        //     {
        //         for(int k = j + 1; k < nums.length; k++)
        //         {
        //             if(nums[i] + nums[j] + nums[k] == 0)
        //             {
        //                 List<Integer> curr = Arrays.asList(nums[i], nums[j], nums[k]);
        //                 Collections.sort(curr);

        //                 if (!res.contains(curr)) 
        //                 {
        //                     res.add(curr);
        //                 }
        //             }
        //         }
        //     }
        // }

        // return res;
    }
}