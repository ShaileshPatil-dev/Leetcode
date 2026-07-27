class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int Max1 =nums[nums.length-1]-1 ;
        int Max2=nums[nums.length-2] -1;
        int Min1=nums[0]-1;
        int Min2=nums[1] -1;
        return Math.max(Max1*Max2,Min1*Min2);
    }
}