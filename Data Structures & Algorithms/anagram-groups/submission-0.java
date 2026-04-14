class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm = new HashMap<>();
        
        for(int i=0;i<strs.length;i++)
        {
            char[] a = strs[i].toCharArray();
            Arrays.sort(a);
            String sorteds = new String(a);
            hm.putIfAbsent(sorteds,new ArrayList<>());
            hm.get(sorteds).add(strs[i]);
            
            
        }
        return new ArrayList<>(hm.values());
        
    }
}
