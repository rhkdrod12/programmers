import java.util.ArrayList;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 10000000;
		int n = 1000;
		
		System.out.println(Arrays.toString(new Solution().solution(x, n)));
		
	}

}

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0 ; i< n ; i++) {
        	answer[i] = x+((long)i*x);
        }
        return answer;
    }
}