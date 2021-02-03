import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,2,3,4};
		
		System.out.println("´ä: " + new Solution().solution(arr));
	}

}


class Solution {
//    public double solution(int[] arr) {
//        return Arrays.stream(arr).average().getAsDouble();
//    }
	
	public double solution(int[] arr) {
		double answer = 0;
		for(int i = 0 ; i< arr.length ; i++) {
			answer += arr[i];
		}
        return answer/arr.length;
    }
}