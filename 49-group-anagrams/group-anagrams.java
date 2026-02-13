class Solution {
    public List<List<String>> groupAnagrams(String[] strs) 
    {
        // Optimal Solution
        Map<String, List<String>> group = new HashMap<>();

        for(String s : strs)
        {
            int[] count = new int[26];
            for(char c : s.toCharArray())
            {
                count[c - 'a']++;
            }
            String key = Arrays.toString(count);
            group.putIfAbsent(key, new ArrayList<>());
            group.get(key).add(s);
        }

        return new ArrayList<>(group.values());


        // // Brute force
        // Map<String, List<String>> group = new HashMap<>();

        // for(String s : strs)
        // {
        //     char[] charArray = s.toCharArray();
        //     Arrays.sort(charArray);
        //     String sorted = new String(charArray);
        //     group.putIfAbsent(sorted, new ArrayList<>());
        //     group.get(sorted).add(s);
        // }
        //  return new ArrayList<>(group.values());

    }
}