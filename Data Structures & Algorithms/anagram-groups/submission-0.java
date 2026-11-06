class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<List<Integer>, List<String>> anagramMap = new HashMap<List<Integer>, List<String>>();

        for (String S : strs) {
            int[] frequencies = stringToFreqArray(S);

            List<Integer> key = new ArrayList<>();

            for (int frequency : frequencies) {
                key.add(frequency);
            }

            anagramMap
                .computeIfAbsent(key, k-> new ArrayList<>())
                .add(S);
            
        }

        return new ArrayList<>(anagramMap.values());

    }

    public int[] stringToFreqArray(String s) {
        int[] freqArray = new int[26];

        for (int i = 0; i < s.length(); i++) {
            freqArray[s.charAt(i) - 'a']++;
        }

        return freqArray;
    }
}
