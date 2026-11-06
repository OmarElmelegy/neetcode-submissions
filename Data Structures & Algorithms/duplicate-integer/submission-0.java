class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n = nums.length;
        HashSet<Integer> numSet = new HashSet<Integer>(n);

        for (Integer i : nums) {
            if (numSet.contains(i)) {
                return true;
            }

            numSet.add(i);
        }

        return false;
    }
}