import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] arr1 = {{1,2},{2,3}};
		int[][] arr2 = {{3,4},{5,6}};
		
		int[][] answer = new Solution().solution(arr1, arr2);
		
		System.out.println("´ä: ");
		Arrays.stream(answer).forEach(x->System.out.println(Arrays.toString(x)));
		
	}

}

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[0].length];
        
        for(int i = 0 ; i < arr1.length ; i++) {
        	for(int j = 0 ; j < arr1[0].length ; j++) {
        		answer[i][j] = arr1[i][j] + arr2[i][j];
        	}
        }
        
        return answer;
    }
}