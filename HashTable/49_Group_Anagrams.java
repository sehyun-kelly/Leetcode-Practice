/** 98.81%, 31.71% */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> anagrams = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            String curr = strs[i];
            char[] chars = curr.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);

            if(!anagrams.containsKey(newWord)) {
                anagrams.put(newWord, new ArrayList<>());
            }
                
            anagrams.get(newWord).add(curr);
        }

        return new ArrayList<>(anagrams.values());

    }
}