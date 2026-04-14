class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int a[] = new int[2];
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {  a[0]=hs.get(target-nums[i]);
            a[1]=i;
         
            }
            hs.put(nums[i],i); 
        }
        
        return a;
    }
}
