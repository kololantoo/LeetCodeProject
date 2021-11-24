package leetcode.editor.cn;
class RemoveDuplicatesFromSortedArray{
	public static void main(String[] args) {
		Solution solution = new RemoveDuplicatesFromSortedArray().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int removeDuplicates(int[] nums) {
		if (nums.length==0) {
			return 0;
		}
		int count = 1;
		for (int i = 0; i < nums.length-1; i++) {
			if (nums[i]!=nums[i+1]) {
				nums[count] = nums[i+1];
				count++;
			}
		}
		return count;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
