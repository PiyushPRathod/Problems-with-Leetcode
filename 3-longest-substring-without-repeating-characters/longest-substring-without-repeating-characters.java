class Solution {
    public int lengthOfLongestSubstring(String s) 
    {
        int n = s.length();
        int[] last = new int[128];
        java.util.Arrays.fill(last, -1);

        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < n; right++)
        {
            char c = s.charAt(right);
            if(last[c] >= left)
            {
                left = last[c] + 1;
            }
            last[c] = right;
            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }
}