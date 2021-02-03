import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "ABaZz";
		int n = 1 ;
		
		System.out.println(new Solution().solution(s, n));
	}

}

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i = 0 ; i < s.length() ; i++) {
        	char temp = s.charAt(i);
        	if(temp >= 65 && temp <= 90) {
        		answer += (char)((temp-65+n)%26+65);
        	}else if(temp == ' '){
        		answer += temp;
        	}else {
        		answer += (char)((temp-97+n)%26+97);
        	}
        }
        
        return answer;
    }
}