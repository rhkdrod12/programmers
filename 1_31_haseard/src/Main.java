
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 11;
		
		System.out.println("´ä: " + new Solution().solution(x));
	}

}

class Solution {
    public boolean solution(int x) {

    	int temp = 0;
        int n = x;
    	int length = String.valueOf(x).length();
        
        for(int i = 0 ; i < length ; i++) {
        	temp += n%10;
        	n/=10;
        }
        return x%temp == 0;
    }
}