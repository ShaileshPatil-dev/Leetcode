class Solution {
    public double findMaxAverage(int[] nums, int k) {

        int sum = 0;
        double avg;
        double max;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        avg = (double) sum / k;
        max = avg;

        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k] + nums[i];

            avg = (double) sum / k;

            max = Math.max(max, avg);
        }

        return max;
    }
}