class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            ArrayList<Integer> temp = new ArrayList<>();  // Bug 2 fix: fresh temp each iteration
            while (nums[i] > 0) {
                temp.add(nums[i] % 10);
                nums[i] /= 10;
            }
            Collections.reverse(temp);
            for (int j = 0; j < temp.size(); j++) {
                list.add(temp.get(j));  // Bug 1 fix: just add, no remove
            }
        }

        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {  // Bug 3 fix: list.size()
            ans[i] = list.get(i);
        }
        return ans;
    }
}