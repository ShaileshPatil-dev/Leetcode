class Solution {
    public int[] transformArray(int[] nums) {
        int[] ans = new int[nums.length];
        int zero = 0;
        int one = 0;
        for(int i = 0 ; i< nums.length;i++){
            if(nums[i]%2 == 0){
                zero++;
            }
            else{
                one++;
            }
        }
        for(int i = 0 ; i<zero ;i++){
            ans[i] = 0;
        }
        for(int i = zero ; i < ans.length ; i++){
            ans[i] = 1;
        }
        return ans;
    }
}