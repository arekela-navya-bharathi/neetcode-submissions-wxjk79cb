class Solution {
    public int removeElement(int[] nums, int val) {
        int j = nums.length - 1;
        int a = 0;

        for(int i = 0; i <= j; i++) {
            if(nums[i] == val) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j--;
                i--; // 🔥 recheck swapped element
            } else {
                a++;
            }
        }

        return a;
    }
}