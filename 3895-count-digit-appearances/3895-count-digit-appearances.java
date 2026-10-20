class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0 ; i<nums.length;i++){
            count+=FindDigit(nums[i],digit);
        }
        return count;
    }
    static int FindDigit(int num , int target)
    {   int count =0;
        while(num>0){
            int rem = num%10;
            if(rem==target){
                count++;
            }
            num/=10;
        }
        return count;
    }
}