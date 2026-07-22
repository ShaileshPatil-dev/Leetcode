class Solution {
    public int missingNumber(int[] nums) {
        int i = 0 ;
        while(i < nums.length)
        {
            int correctposition = nums[i];
            if(nums[i]<nums.length && nums[i]!= nums[correctposition]){
                int temp = nums[correctposition];
                nums[correctposition]= nums[i];
                nums[i]= temp;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length ; i++){
            if(nums[i]!= i){
                return i;
            }
        }
        return nums.length;
    }
}