class Solution {
    public int removeDuplicates(int[] nums) {
        int Pos = 1; // Position to place the next unique element
        
        for (int index = 1; index < nums.length; index++) {
            
            if (nums[index] != nums[index - 1]) { 
                nums[Pos] = nums[index]; // Place unique element at position
                Pos++; // Increment position
            }

        }
        
        return Pos; // Return new length of the array with unique elements
    }
}
