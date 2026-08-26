class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean conIncrease= true;
        boolean conDecrease= true;

        for(int i = 0 ; i <nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                conIncrease = false;
            }
        }

        for(int i = 0 ; i <nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                conDecrease = false;
            }
        }
        if(conIncrease == true || conDecrease == true ){
            return true;
        }
        return false;
    }
}