class Solution {
    public int removeElement(int[] nums, int val) {
      int right =0;
      int left = 0;
      for(int i=0; i < nums.length ; i++){
        if(nums[right]==val){
            right++;
        }
        else if (nums[right]!= val){
            nums[left]= nums[right];
            left++;
            right++;
        }
      }  
      return left;
    }
}