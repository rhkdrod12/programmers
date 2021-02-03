
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwer";
		
		System.out.println(new Solution().solution(s));
	}

}


class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        
        if(s.length()%2 == 0) {
        	return answer += s.charAt(s.length()/2-1) + "" + s.charAt(s.length()/2);
        }else {
        	return answer += s.charAt(s.length()/2);
        }
    }
}