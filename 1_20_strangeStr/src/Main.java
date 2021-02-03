
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "try hello world";
		
		System.out.println(new Solution().solution(s));
		
		
	}
}


class Solution {
    public String solution(String s) {
       
        StringBuilder temp = new StringBuilder(s.toLowerCase());
       
        int idx = 0;
        for(int i = 0 ; i < temp.length() ; i++) {
        	if(idx++%2 == 0 && temp.charAt(i) != ' ') temp.setCharAt(i, (char) (temp.charAt(i)-32));
        	if(temp.charAt(i) == ' ') idx = 0;
        }
        
        return temp.toString();
    }
}