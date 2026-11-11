class Solution {
    public void moveZeroes(int[] nums) {
       int ind = 0;
       for(int num : nums)
            if(num != 0)
                nums[ind++] = num;
        
        for(int i = ind ; i < nums.length ; i++)       
            nums[i] = 0;
    }
}