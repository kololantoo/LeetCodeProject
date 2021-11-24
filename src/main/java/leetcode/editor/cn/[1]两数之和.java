package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;

class TwoSum{
	public static void main(String[] args) {
		Solution solution = new TwoSum().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] twoSum(int[] nums, int target) {
		Map<Integer,Integer> map = new HashMap<>();
		for (int i=0;i<nums.length;i++){
			int x = target-nums[i];
			if (map.containsKey(x)) {
				return new int[]{i,map.get(x)};
			}
			map.put(nums[i],i);
		}
		throw new IllegalArgumentException("no result");
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
