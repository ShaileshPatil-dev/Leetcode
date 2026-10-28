class Solution {
public List<List<Integer>> permute(int[] nums) {
List<List<Integer>> ans = new ArrayList<>();
List<Integer> ds = new ArrayList<>();
boolean[] frq = new boolean[nums.length];
    dopermutation(nums, frq, ds, ans);
    return ans;
}

private void dopermutation(int[] nums, boolean[] frq,
                           List<Integer> ds,
                           List<List<Integer>> ans) {
    if (ds.size() == nums.length) {
        ans.add(new ArrayList<>(ds));
        return;
    }

    for (int i = 0; i < nums.length; i++) {
        if (!frq[i]) {
            frq[i] = true;
            ds.add(nums[i]);

            dopermutation(nums, frq, ds, ans);

            ds.remove(ds.size() - 1);
            frq[i] = false;
        }
    }
}
}
