class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
      ArrayList<Integer> target = new ArrayList<>();
        for(int i =0 ; i< nums.length; i++){
            target.add(index[i],nums[i]);
        }
        int[] ans = new int[target.size()];
        for(int j =0 ; j< ans.length ; j ++){
            ans[j] = target.get(j);
        }
        return ans;
    }
}