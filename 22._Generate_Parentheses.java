class Solution {
    public List<String> generateParenthesis(int n) {
		List<String> ll = new ArrayList<>();
		Parenthesis(0,0,"",n,ll);
		return ll;
		

	}
	public static void Parenthesis(int open,int close,String ans,int n, List<String> ll) {
		if(close==n && open ==n) {
			//System.out.println(ans);
			ll.add(ans);
			return;
		}
		
		
		
		if(open<n) {
		Parenthesis(open+1, close, ans+"(", n,ll);
	}
		
		if(close<open) {
		Parenthesis(open, close+1, ans+")", n,ll);
		}

        
    }
}
