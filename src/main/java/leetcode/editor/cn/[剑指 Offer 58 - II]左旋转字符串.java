package leetcode.editor.cn;
class ZuoXuanZhuanZiFuChuanLcof{
	public static void main(String[] args) {
		Solution solution = new ZuoXuanZhuanZiFuChuanLcof().new Solution();

	}

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String reverseLeftWords(String s, int n) {
		return s.substring(n)+s.substring(0,n);
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
