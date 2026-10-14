class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        solve(candidates, target, 0, new ArrayList<>(), ans);
        return ans;
    }

    public void solve(int[] nums, int target, int index,
                      List<Integer> current, List<List<Integer>> ans) {

        if (target == 0) {
            ans.add(new ArrayList<>(current));
            return;
        }

        if (index == nums.length || target < 0) {
            return;
        }

        current.add(nums[index]);
        solve(nums, target - nums[index], index, current, ans);

        current.remove(current.size() - 1);
        solve(nums, target, index + 1, current, ans);
    }
}