class Solution {
    public int[] leftRightDifference(int[] nums) {

        if(nums.length == 1) {
            return new int[]{0};
        }

        int[] left = new int[nums.length];

        left[0] = 0;
        left[1] = nums[0];

        for(int i = 2; i < nums.length; i++) {
            left[i] = left[i - 1] + nums[i - 1];
        }

        int[] right = new int[nums.length];

        right[right.length - 1] = 0;
        right[right.length - 2] = nums[nums.length - 1];

        for(int i = right.length - 3; i >= 0; i--) {
            right[i] = right[i + 1] + nums[i + 1];
        }

        int[] ans = new int[nums.length];

        for(int i = 0; i < ans.length; i++) {
            ans[i] = Math.abs(left[i] - right[i]);
        }

        return ans;
    }
}