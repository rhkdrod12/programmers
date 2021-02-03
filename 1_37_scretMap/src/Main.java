import java.util.Arrays;

public class Main {

	public static void main(String[] args) {

		int n = 6;
		int[] arr1 = {46,33,33,22,31,50};
		int[] arr2 = {27,56,19,14,14,10};
		
		System.out.println("´ä: " + Arrays.toString(new Solution().solution(n, arr1, arr2)));
		
	}
}

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr1.length];
        
        for(int i = 0 ; i < answer.length ; i++) {
        	answer[i] = toScretMap(arr1[i]|arr2[i], n);
        }
        
        return answer;
    }
    
    public String toScretMap(int num, int n) {
    	String temp = "";
    	for(int i =  0 ; i < n ; i ++) {
    		temp = (num%2==1?"#":" ") + temp;
    		num /=2;
    	}
    	return temp;
    }
}