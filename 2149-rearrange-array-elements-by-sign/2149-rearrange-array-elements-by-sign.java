class Solution {
    public int[] rearrangeArray(int[] nums) {
        int size = nums.length;
        int[] ans = new int[size];

        int pos = 0;
        int neg = 1;

        for (int i = 0; i < size; i++) {

            if (nums[i] > 0) {
                ans[pos] = nums[i];
                pos += 2;
            } else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }

        return ans;
    }
}