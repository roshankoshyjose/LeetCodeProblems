class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j = 0;
        int i = 0;
        while (i < nums.length) {
            if (nums[j] == nums[i]) {
                 i++;
            } else {
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}