class Solution {

    public void sortColors(int[] nums) {

        int i = 0;
        int j = 0;
        int k = nums.length - 1;

        while (j <= k) {

            if (nums[j] == 0) {
                swap(i, j, nums);
                i++;
                j++;
            }

            else if (nums[j] == 1) {
                j++;
            }

            else {
                swap(j, k, nums);
                k--;
            }
        }
    }

    static void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}