class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int size = nums.length;
        int a = 0;
        int b = 1;
        while(a < nums.length && b < nums.length){
            if(nums[a] % 2 == 0){
                a+=2;
            }
            if(nums[b] % 2 == 1){
                b+=2;
            }
            else{
                swap(a,b,nums);
            }
        }
        return nums;
    }
    static void swap(int a , int b, int[] nums){
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}