
public class Main {
	public static void main(String[] args) {
		
		String s = "-1234";
		
		System.out.println(new Solution().solution(s));
	}
}

class Solution {
    public int solution(String s) {
        return  Integer.parseInt(s);
    }
}