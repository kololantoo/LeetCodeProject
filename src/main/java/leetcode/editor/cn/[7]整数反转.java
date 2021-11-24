package leetcode.editor.cn;
class ReverseInteger{
	public static void main(String[] args) {
		Solution solution = new ReverseInteger().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
		String s = null;
		if (x>0) {
			s =  new StringBuilder(x+"").reverse().toString();
		}else {
			s = new StringBuilder(String.valueOf(-x)).append("-").reverse().toString();
		}

		try {
			return Integer.parseInt(s);
		} catch (Exception e){
			return 0;
		}
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
