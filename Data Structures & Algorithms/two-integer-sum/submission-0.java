class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> seen = new HashMap<>();
        for (int j = 0; j < nums.length; j++) {
            Integer i = seen.get(target - nums[j]);   // O(1) — where is the complement?
            if (i != null) return new int[]{i, j};
            seen.put(nums[j], j);
        }

        return new int[]{};
    }
}
