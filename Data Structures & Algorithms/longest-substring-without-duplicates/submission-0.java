class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] a = new int[256];  // stores last seen index
        for(int i = 0; i < 256; i++) {
            a[i] = -1;  // initialize
        }

        int left = 0;
        int maxlen = 0;

        for(int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);

            // if character already seen, move left pointer
            if(a[ch] >= left) {
                left = a[ch] + 1;
            }

            // update last seen index
            a[ch] = right;

            // update max length
            maxlen = Math.max(maxlen, right - left + 1);
        }

        return maxlen;
    }
}