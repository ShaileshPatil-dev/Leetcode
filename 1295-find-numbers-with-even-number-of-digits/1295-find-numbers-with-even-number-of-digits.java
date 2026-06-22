class Solution {
    public int findNumbers(int[] nums) {

        int even = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];
            int counter = 0;

            while (num > 0) {
                num = num / 10;
                counter++;
            }

            if (counter % 2 == 0) {
                even++;
            }
        }

        return even;
    }
}