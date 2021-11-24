package leetcode.editor.cn;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class ValidParentheses{
	public static void main(String[] args) {
		Solution solution = new ValidParentheses().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isValid(String s) {
		boolean result = false;
		char[] chars = s.toCharArray();
		if (chars.length % 2 == 1) {
			return result;
		}
		Map<Character,Character> map = new HashMap<>();
		map.put('(',')');
		map.put('{','}');
		map.put('[',']');
		Stack<Character> stack = new Stack<>();
		for (char c:chars) {
			if (map.containsKey(c)) {
				stack.push(c);
			} else {
				if (stack.empty() || map.get(stack.pop())!=c) {
					return result;
				}
			}
		}
		if (stack.empty()) {
			result = true;
		}
		return result;

    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
