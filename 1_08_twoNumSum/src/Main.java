
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -10000000 ;
		int b = 3;
		
		System.out.println(new Solution().solution(a, b));
		
	}

}


class Solution {
    public long solution(int a, int b) {
        return (long)(a+b)*(Math.abs(a-b)+1)/2;
    }
}