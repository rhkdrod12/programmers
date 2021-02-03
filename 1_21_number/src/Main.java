
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int n = 10000123;
		
		System.out.println("°á°ú: "+new Solution().solution(n));
		
		
		
	}

}

class Solution {
    public int solution(int n) {
        int answer = 0;
        int length = String.valueOf(n).length();
        
        for(int i = 0 ; i < length ; i++) {
        	answer += n%10;
        	n/=10;
        }
        return answer;
    }
}
