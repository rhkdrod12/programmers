
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num = 626331;
		
		System.out.println("´ä: " + new Solution().solution(num));
		
		
	}

}

class Solution {
	
	
    public int solution(int num) {
        return cal(num, 0);
    }
    
    public int cal(long n, int count) {
    	if(n == 1 || count >= 500) return count>=500?-1:count;
    	
    	System.out.println(n);
    	if(n%2 == 0) count = cal(n/2, ++count);
    	else count = cal(n*3 + 1, ++count);
    	
    	return count;
    }
}