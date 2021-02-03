
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long n = 3;
		
		System.out.println("°á°ú°ª: " + new Solution().solution(n));
		
	}

}

class Solution {
    public long solution(long n) {

    	double temp = Math.sqrt(n);
        
        if(temp == (int)temp) {
        	return (long)Math.pow(temp+1, 2);
        }else {
        	return -1L;
        }
        
    }
}