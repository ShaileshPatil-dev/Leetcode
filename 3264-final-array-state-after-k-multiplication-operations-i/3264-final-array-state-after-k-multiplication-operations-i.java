class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {

        for (int i = 0; i < k; i++) {
            int index = FindMin(nums);
            nums[index] = nums[index] * multiplier;
        }

        return nums;
    }

    static int FindMin(int[] arr) {
        int index = 0;
        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }

        return index;
    }
}