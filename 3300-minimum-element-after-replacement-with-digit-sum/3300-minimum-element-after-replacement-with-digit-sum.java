class Solution {
    public int minElement(int[] nums) {
            int min = Integer.MAX_VALUE;
        for(int i =0; i<nums.length ; i++){
            int sod = 0 ;
            while(nums[i] > 0){
                int rem = nums[i]%10;
                sod+=rem;
                nums[i]/=10;
            }
            min = Math.min(min,sod);
            nums[i] = sod;
        }
        return min;
    }
}