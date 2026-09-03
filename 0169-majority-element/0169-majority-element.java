class Solution {

    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int value = 0;

        for (int i = 0; i < nums.length; i++) {

            if (map.get(nums[i]) > max) {
                max = map.get(nums[i]);
                value = nums[i];
            }
        }

        return value;
    }
}
