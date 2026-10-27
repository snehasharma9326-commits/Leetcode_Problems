class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long ans = Long.MIN_VALUE;
        Map<Integer, Long> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(nums[i] - k)) {
                ans = Math.max(ans, sum - map.get(nums[i] - k));
            }

            if (map.containsKey(nums[i] + k)) {
                ans = Math.max(ans, sum - map.get(nums[i] + k));
            }

            map.put(nums[i], Math.min(map.getOrDefault(nums[i], Long.MAX_VALUE), sum - nums[i]));
        }

        return ans == Long.MIN_VALUE ? 0 : ans;
    }
}