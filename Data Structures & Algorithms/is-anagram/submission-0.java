class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_char = s.toCharArray();
        char[] t_char = t.toCharArray();

        Arrays.sort(s_char);
        Arrays.sort(t_char);

        int result = Arrays.compare(s_char, t_char);

        Boolean b_result = (result == 0);

        return b_result;
    }
}
