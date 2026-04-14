

class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int len = 1;      // current sequence length
        int maxlen = 1;   // max sequence length

        for(int i = 0; i < nums.length - 1; i++) {

            if(nums[i] == nums[i+1]) {
                continue; // skip duplicates
            }
            else if(nums[i+1] - nums[i] == 1) {
                len++;   // consecutive
            }
            else {
                maxlen = Math.max(maxlen, len);
                len = 1; // reset
            }
        }

        return Math.max(maxlen, len);
    }
}