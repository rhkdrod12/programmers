import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 3;
		int m = 12;
		
		System.out.println(Arrays.toString(new Solution().solution(n, m)));
	}

}

class Solution {
    public int[] solution(int n, int m) {

    	int gcd = gcd(n, m);
        int lcm = n*m/gcd;
                	
        return new int[] {gcd, lcm};
    }
    
    int gcd(int a, int b) {
    	while(b!=0) {
    		int r = a%b;
    		a=b;
    		b=r;
    	}
    	return a;
    }
}

