class Solution {
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0 ;
        int j = nums.length -1;

        double ans = 51;
        while(i < j){
            double avg = (nums[i] + nums[j])/2.0;
            if(avg < ans){
                ans = avg;
            }
            i++;
            j--;
        }
        return ans;
    }
}