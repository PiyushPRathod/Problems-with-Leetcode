class Solution {
    public boolean isValidSudoku(char[][] board) 
    {
        // Optimal Solution
        Set<Character>[] rows = new HashSet[9];
        Set<Character>[] cols = new HashSet[9];
        Set<Character>[] boxes = new HashSet[9];

        for(int i = 0; i < 9; i++)
        {
            rows[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            boxes[i] = new HashSet<>();
        }

        for(int r = 0; r < 9; r++)
        {
            for(int c = 0; c < 9; c++)
            {
                char val = board[r][c];

                if(val == '.') 
                    continue;

                int box = (r / 3) * 3 + (c / 3);

                if(rows[r].contains(val) || cols[c].contains(val) || boxes[box].contains(val))
                {
                    return false;
                }
                
                rows[r].add(val);
                cols[c].add(val);
                boxes[box].add(val);
            }
        }

        return true;

        // // Brute Force
        // // Check rows
        // for(int row = 0; row < 9; row++)
        // {
        //     Set<Character> seen = new HashSet<>();
        //     for(int col = 0; col < 9; col++)
        //     {
        //         char val = board[row][col];
        //         if(val == '.') continue;

        //         if(seen.contains(val)) return false;
        //         seen.add(val);
        //     }
        // }

        // // Check columns
        // for(int col = 0; col < 9; col++)
        // {
        //     Set<Character> seen = new HashSet<>();
        //     for(int row = 0; row < 9; row++)
        //     {
        //         char val = board[row][col];
        //         if(val == '.') continue;
                    
        //         if(seen.contains(val)) return false;
        //         seen.add(val);
        //     }
        // }

        // // Check 3x3 boxes
        // for(int startRow = 0; startRow < 9; startRow += 3)
        // {
        //     for(int startCol = 0; startCol < 9; startCol += 3)
        //     {
        //         Set<Character> seen = new HashSet<>();
        //         for(int row = startRow; row < startRow + 3; row++)
        //         {
        //             for(int col = startCol; col < startCol + 3; col++)
        //             {
        //                 char val = board[row][col];
        //                 if(val == '.') continue;
                            
        //                 if(seen.contains(val)) return false;
        //                 seen.add(val);
        //             }
        //         }
        //     }
        // }

        // return true;        
    }
}