
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4};
		int[] b = {-3,-1,0,2};
		
		System.out.println(new Solution().solution(a, b));
	}

}

class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;
        
        for(int i = 0 ; i < a.length; i++) {
        	answer += a[i]*b[i];
        }
        
        return answer;
    }
}