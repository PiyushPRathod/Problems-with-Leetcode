class Solution {
    public int[] topKFrequent(int[] nums, int k) 
    {
        // Optimal Solution
        HashMap<Integer, Integer> freq = new HashMap<>();

        for(int num : nums)
        {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Use Bucket sort
        List<Integer>[] buckets = new List[nums.length + 1];
        for(Map.Entry<Integer, Integer> e : freq.entrySet())
        {
            int num = e.getKey();
            int count = e.getValue();
            if(buckets[count] == null) buckets[count] = new ArrayList<>();
            buckets[count].add(num);
        }
        
        int[] res = new int[k];
        int idx = 0;

        for(int count = nums.length; count >= 1 && idx < k; count--)
        {
            if(buckets[count] != null)
            {
                for(int num : buckets[count])
                {
                    res[idx++] = num;
                    if(idx == k) break;
                }
            }
        }

        return res;

        // // Brute force
        // HashMap<Integer, Integer> freq = new HashMap<>();

        // for(int num : nums)
        // {
        //     freq.put(num, freq.getOrDefault(num, 0) + 1);
        // }

        // List<int[]> list = new ArrayList<>();

        // for(Map.Entry<Integer, Integer> entry : freq.entrySet())
        // {
        //     list.add(new int[] {
        //         entry.getValue(), entry.getKey()
        //     });
        // }

        // list.sort((a, b) -> b[0] - a[0]);

        // int[] result = new int[k];
        // for(int i = 0; i < k; i++)
        // {
        //     result[i] = list.get(i)[1];
        // }

        // return result;
        
    }
}