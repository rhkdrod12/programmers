import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dartResult = "1D2S3T*";
		
		System.out.println("´ä: " + new Solution().solution(dartResult));
		
	}

}

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        String[] score = dartResult.split("\\D+");
        String[] control = dartResult.split("\\d+");
        
        int[] answers = new int[score.length];
        
        for(int i = 0 ; i < score.length ; i++) {
        	if(i>0) answers[i-1] *=option(control[i+1])==-1?1:option(control[i+1]);
        	answers[i] = cal(score[i], control[i+1].charAt(0)) * option(control[i+1]);
        }
        
        for(int i =  0 ; i< answers.length ; i++) answer += answers[i];
        
        return answer;
    }
    public int cal(String score, char bonus) {
    	
    	if(bonus == 'S') {
    		return (int)Math.pow(Integer.parseInt(score), 1);
    	}else if(bonus == 'D') {
    		return (int)Math.pow(Integer.parseInt(score), 2);
    	}else {
    		return (int)Math.pow(Integer.parseInt(score), 3);
    	}
    }
    
    public int option(String control) {
    	if(control.length() > 1) {
			if(control.charAt(1) == '*') {
				return 2;
			}else {
				return -1;
			}
		}
    	return 1;
    }
}