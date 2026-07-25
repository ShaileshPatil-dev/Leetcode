class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0 ;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i]!=nums[correct]){
                int temp = nums[i];
                nums[i] = nums[correct];
                nums[correct]= temp;
            }
            else{
                if(i!=correct){
                     ans[0]=nums[i];
                     ans[1]= i+1;
                }
                i++;
            }
        }
        return ans;
    }
}