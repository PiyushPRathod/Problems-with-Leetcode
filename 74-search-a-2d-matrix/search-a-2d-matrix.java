class Solution {
    public boolean searchMatrix(int[][] matrix, int target) 
    {
        //Binary Search method
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0)
        {
            return false;
        }

        int row = matrix.length;
        int col = matrix[0].length;
        int left = 0;
        int right = row * col - 1;

        while(left <= right)
        {
            int mid = left + (right - left) / 2;

            int midVal = matrix[mid / col][mid % col];

            if(midVal == target)
            {
                return true;
            }
            else if(midVal < target)
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;
            }

        }
        return false;


        // //Basic searching method
        // int row = matrix.length;
        // int col = matrix[0].length;

        // for(int i = 0; i < row; i++)
        // {
        //     for(int j = 0; j < col; j++)
        //     {
        //         if(matrix[i][j] == target)
        //         {
        //             return true;
        //         }
        //     }
        // }

        // return false;
        
    }
}