class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 1;
        int index = 0;

        while(i<nums.length){
            if(nums[i] != nums[index]){
                index++;
                nums[index] = nums[i];
                
            }    
            i++;
                
            
        }
            return index+1;
    }
}