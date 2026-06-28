package leetcode;

class two_sum {
    public int[] twoSum(int[] nums, int target) {
        int i;
        int j;
        int i_ans = 0;
        int j_ans = 0;
        for (i = 0; i < (nums.length - 1); i++) {
            for (j = i + 1; j < nums.length; j++) {
                if ((target == nums[i] + nums[j])) {
                    i_ans = i;
                    j_ans = j;
                }
            }
        }
        int[] ans = { i_ans, j_ans };
        return ans;
    }
}
