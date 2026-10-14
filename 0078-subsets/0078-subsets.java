class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        solve(nums, 0, current, ans);
        return ans;
    }

    public void solve(int[] nums, int index, List<Integer> current, List<List<Integer>> ans) {

        if (index == nums.length) {
            ans.add(new ArrayList<>(current));
            return;
        }

        solve(nums, index + 1, current, ans);

        current.add(nums[index]);
        solve(nums, index + 1, current, ans);

        current.remove(current.size() - 1);
    }
}