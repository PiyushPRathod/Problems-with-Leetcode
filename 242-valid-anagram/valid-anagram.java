class Solution {
    public boolean isAnagram(String s, String t) 
    {
        //Sorting method
        if(s.length() == 0 || t.length() == 0)
        {
            return false;
        }        

        char[] charArray1 = s.toCharArray();
        char[] charArray2 = t.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}