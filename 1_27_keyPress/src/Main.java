public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		int[] numbers = {7,0,8,2,8,3,1,5,7,6,2};
		String hand = "left";
		
		System.out.println(new Solution().solution(numbers, hand));
	}

}

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        
        
        int[] left = {0,0};
        int[] right = {0,2};
        
        int[][] axis = new int[10][2];
        
        axis[0] = new int[] {0,1};
        
        for(int i = 0 ; i < 9 ; i++) {
        	axis[i+1] = new int[]{3-i/3, i%3};
        }
        
        for(int i = 0 ; i < numbers.length; i++) {
        	
        	if(axis[numbers[i]][1] == 0) {
        		answer += "L";
        		left = axis[numbers[i]];
        	}else if(axis[numbers[i]][1] == 2) {
        		answer += "R";
        		right = axis[numbers[i]];
        	}else {
        		int[] temp = axis[numbers[i]];
        		int l = Math.abs(temp[0] - left[0]) + Math.abs(temp[1] - left[1]);
        		int r = Math.abs(temp[0] - right[0]) + Math.abs(temp[1] - right[1]);
        		
        		if(l < r) {
        			answer += "L";
        			left = axis[numbers[i]];
        		}
        		else if(l > r) {
        			answer += "R";
        			right = axis[numbers[i]];
        		}
        		else {
        			if(hand.equals("right")) {
        				answer += "R";
        				right = axis[numbers[i]];
        			}else {
        				answer += "L";
        				left = axis[numbers[i]];
        			}
        		}
        	}
        }
        
        return answer;
    }
    
}