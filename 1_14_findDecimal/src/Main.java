
public class Main {
	public static void main(String[] args) {
		
		
		int n = 5;
		
		System.out.println(new Solution().solution(n));
		
	}
}


class Solution {
    public int solution(int n) {
        int answer = 0;
        
        boolean[] sosu = new boolean[n+1];
        
        for(int i = 2 ; i * i <= n ; i++) {
        	if(sosu[i] != true) {
        		for(int j = i*i ; j <= n ; j+=i) sosu[j] = true;
        	}
        }
        
        for(int i = 2 ; i<= n ; i++) if(sosu[i] != true) answer++;
        
        return answer;
    }
}

