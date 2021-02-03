
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n = 125;
		System.out.println(new Solution().solution(n));
	}
}

class Solution {
    public int solution(int n) {
        int answer = 0;
        String temp = "";
        
        while(n/3 != 0) {
        	temp = n%3 + temp;
        	n/=3;
        }
        temp = n + temp;
        
        for(int i = 0; i< temp.length() ; i++) {
        	answer += (temp.charAt(i)-48)*(int)Math.pow(3, i);
        }
        
        return answer;
    }
}

