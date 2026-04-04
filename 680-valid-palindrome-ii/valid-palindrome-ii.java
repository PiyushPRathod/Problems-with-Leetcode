class Solution {
    public boolean validPalindrome(String s) 
    {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) 
            {
                int left = i + 1, right = j;
                while (left < right && s.charAt(left) == s.charAt(right)) 
                {
                    left++;
                    right--;
                }

                if (left >= right) return true;

                left = i;
                right = j - 1;
                while (left < right && s.charAt(left) == s.charAt(right)) 
                {
                    left++;
                    right--;
                }

                return left >= right;
            }
            i++;
            j--;
        }

        return true;
    }
}