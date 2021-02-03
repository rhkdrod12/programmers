import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stages = {2,1,2,6,2,4,3,3};
//		int[] stages = {1,2,2,1,3};
		int N = 5;
		
		System.out.println("´ä: " + Arrays.toString(new Solution().solution(N, stages)));

	}

}


class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        
        double[][] failMap = new double[N][2];
        
        for(int i = 0 ; i < failMap.length ; i++) {
        	failMap[i][0] = i;
        }
        
        
        double[] stageUsers = new double[N];
        
        for(int i = 0 ; i < stages.length ; i++) {
        	if(stages[i] <= N) stageUsers[stages[i]-1] += 1;
        }
        
        
        int temp = 0;
        for(int i = 0 ; i < failMap.length ; i++) {
        	temp += i>0?stageUsers[i-1]:0;
    		failMap[i][1] = (stages.length - temp)== 0? 0:(stageUsers[i]/(stages.length - temp));
        }
        
        
        Arrays.sort(failMap, (x,y)->x[1]<y[1]?1:(x[1]==y[1]?(x[0]>y[0]?1:-1):-1));
      
        
        for(int i = 0 ; i< answer.length ; i++) {
        	answer[i] = (int) (failMap[i][0]+1);
        }
        
        return answer;
    }
}