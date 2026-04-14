

class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        HashMap<Integer, Integer> hs = new HashMap<>();

       
        for (int i = 0; i < nums.length; i++) {
            hs.put(nums[i], hs.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> ls = new ArrayList<>(hs.keySet());
        Collections.sort(ls,(a,b)-> hs.get(b)-hs.get(a));
        int s[] = new int[k];

        for(int i=0;i<k;i++)
        {
            s[i]=ls.get(i);
        }
        return s;
    }
}