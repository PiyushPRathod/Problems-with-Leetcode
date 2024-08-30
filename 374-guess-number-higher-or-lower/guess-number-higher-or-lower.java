/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) 
    {
        int high = n;
        int low = 1;

        while(low <= high)
        {
            int num = low + (high - low)/2;
            int retVal = guess(num);
            if(retVal == 1)
                low = num + 1;
            else if(retVal == -1)
                high = num - 1;
            else if(retVal == 0)
                return num;
        }
        return -1;
    }
}