class Solution {
    public int[] replaceElements(int[] arr) 
    {
        int n = arr.length;
        
        // Initialize the greatest element on the right side as -1
        int greatest = -1;
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) 
        {
            // Store the current element before replacing it
            int current = arr[i];
            
            // Replace arr[i] with the greatest element to its right
            arr[i] = greatest;
            
            // Update the greatest element if the current element is larger
            if (current > greatest) 
            {
                greatest = current;
            }
        }
        
        return arr;  
    }
}