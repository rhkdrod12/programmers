
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 9;
		System.out.println("´ä: " + new Solution().solution(n));
	}

}


class Solution {
	public String solution(int n) {
	      String[] num = {"4","1","2"};
	      StringBuilder answer = new StringBuilder();

	      while(n > 0){
	    	  answer.append(num[n % 3]);
	    	  System.out.println(n);
	          n = (n - 1) / 3;
	      }
	      return answer.reverse().toString();
	  }
}