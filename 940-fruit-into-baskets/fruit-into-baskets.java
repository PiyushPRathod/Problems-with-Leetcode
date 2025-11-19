class Solution {
    public int totalFruit(int[] fruits) 
    {
        Map<Integer, Integer> map = new HashMap<>();
        int start = 0, end = 0, counter = 0, len = 0;

        while(end < fruits.length)
        {
            int a = fruits[end];
            map.put(a, map.getOrDefault(a,0) + 1);
            if(map.get(a) == 1) counter++;
            end++;
            while(counter > 2)
            {
                int temp = fruits[start];
                map.put(temp, map.get(temp) - 1);
                if(map.get(temp) == 0) counter--;
                start++;
            }
            len = Math.max(len, end - start);
        }        
        return len;
    }
}