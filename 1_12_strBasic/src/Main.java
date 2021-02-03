
public class Main {
	public static void main(String[] args) {
		
		String s = "1234";
		
		System.out.println(new Solution().solution(s));
	}
}

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        if(s.length() == 4 || s.length() ==6) {
        	try {
				Integer.parseInt(s);
				return true;
			} catch (NumberFormatException e) {}
        }
        return false;
    }
}
