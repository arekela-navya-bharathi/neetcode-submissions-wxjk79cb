class Solution {
    public int[] getConcatenation(int[] nums) {
        int a[]  = new int[nums.length*2];
        int j=0;
        for(int i=0;i<a.length;i++)
        {
            a[i] =nums[j];
            j++;
            if(j>nums.length-1)
            {
                j=0;
            }


        }
        return a;
    }
}