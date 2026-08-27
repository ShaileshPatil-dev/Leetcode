class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i< nums.length;i++){
            int indexValue = Math.abs(nums[i]);
            nums[indexValue-1]= -Math.abs(nums[indexValue-1]);
        }

        List<Integer> list = new ArrayList<>();

        for(int j = 0 ; j<nums.length ;j++){
            if(nums[j]>0){
                list.add(j+1);
            }
        }
        return list;
    }
}