class Solution {
    public int longestConsecutive(int[] nums) 
    {
        //Brute Force 
        Set<Integer> sequence = new HashSet<>();
        for(int num : nums)
        {
            sequence.add(num);
        }

        int maxLength = 0;
        
        for(int num : sequence)
        {
            if(!sequence.contains(num - 1))
            {
                int currentNum = num;
                int currentLen = 1;

                while(sequence.contains(currentNum + 1))
                {
                    currentNum++;
                    currentLen++;
                }

                maxLength = Math.max(maxLength, currentLen);
            }
        }

        return maxLength;
    }
}