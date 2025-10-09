class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) 
    {
        int n = grid.length;
        int m = n * n;

        Map<Integer, Integer> freq = new HashMap<>(m * 2);
        for(int[] row : grid)
        {
            for(int v : row)
            {
                freq.put(v, freq.getOrDefault(v, 0) + 1);
            }
        }

        int a = -1;
        int b = -1;
        for(int x = 1; x <= m; x++)
        {
            int c = freq.getOrDefault(x, 0);
            if(c == 0)
                b = x;
            else if(c == 2)
                a = x;
            if(a != -1 && b != -1)
                break;
        }        

        return new int[]{a, b};
    }
}