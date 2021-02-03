import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 10000000000L;
		
		System.out.println(Arrays.toString(new Solution().solution(n)));
		
	}

}

class Solution {
    public int[] solution(long n) {
        
    	System.out.println("n: " + n);
    	
    	int length = String.valueOf(n).length();
    	int[] answer = new int[length];
    	
    	for(int i = 0 ; i < length ; i++) {
    		answer[i] = (int)(n%10);
    		n/=10L;
    	}
        
        return answer;
    }
}
