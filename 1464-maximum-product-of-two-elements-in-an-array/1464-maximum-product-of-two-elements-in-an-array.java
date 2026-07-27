class Solution {
    public int maxProduct(int[] nums) {
        int M1 = Integer.MIN_VALUE;
        int M2 = Integer.MIN_VALUE;
        // Arrays.sort(nums);
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>M1){
                M2=M1;
                M1=nums[i];
            }
            else if(nums[i]>M2){
                M2=nums[i];
            }
        }
        // int Max1 =nums[nums.length-1]-1 ;
        // int Max2=nums[nums.length-2] -1;
        // int Min1=nums[0]-1;
        // int Min2=nums[1] -1;
        // return Math.max(Max1*Max2,Min1*Min2);
        return (M1-1)*(M2-1);
    }
}