class Solution {
    public void moveZeroes(int[] nums) {
        int slow = 0;
        int fast = 0;
        while(fast<nums.length){
            if(nums[fast]!=0){
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        
        for(;slow<nums.length;slow++){
            nums[slow]=0;
        }
    }
}