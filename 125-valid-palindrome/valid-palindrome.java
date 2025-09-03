class Solution {
    public boolean isPalindrome(String s) 
    {
        //Brute Force
        int i = 0, j = s.length() - 1;
        while (i < j) {
            // skip non-alphanumeric on the left
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            // skip non-alphanumeric on the right
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            char left = Character.toLowerCase(s.charAt(i));
            char right = Character.toLowerCase(s.charAt(j));

            if (left != right) return false;

            i++;
            j--;
        }
        return true;
    }
}