package leetcode.editor.cn;
class RemoveElement{
	public static void main(String[] args) {
		Solution solution = new RemoveElement().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
