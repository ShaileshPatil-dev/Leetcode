class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] ans = new int[2];
        int pos = 0;
        HashMap<Integer, Integer > map = new HashMap<>();
        for(int i = 0 ; i< nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            }
            else{
                ans[pos]=nums[i];
                pos++;
            }
        }
        return ans;
    }
}