
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 4;
		
		System.out.println(new Solution().solution(num));
	}

}
class Solution {
    public String solution(int num) {
        return num%2 == 0? "Even":"Odd";
    }
}