class Solution {
    public int numJewelsInStones(String jewels, String stones) 
    {
        int count = 0;
        for(int i = 0; i < stones.length(); i++)
        {
            char s = stones.charAt(i);
            for(int j = 0; j < jewels.length(); j++)
            {
                if(s == jewels.charAt(j))
                {
                    count++;
                    break;
                }
            }
        }

        return count;
        
    }
}