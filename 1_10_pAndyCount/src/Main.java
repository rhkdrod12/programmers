
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "pPoooyY";
		
		
		System.out.println(new Solution().solution(s));
		
		
	}

}


class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for(int i = 0 ; i < s.length() ; i++) {
        	if(s.charAt(i) == 'p' || s.charAt(i) == 'P') count++;
        	else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') count--;
        }
        
        return count == 0;
    }
}