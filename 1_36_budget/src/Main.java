import java.util.ArrayList;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int[] d = {1,3,2,5,4};
//		int[] d = {2,2,3,3};
		int budget = 9;
		
		System.out.println("´ä: " + new Solution().solution(d, budget));
		
	}

}

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        for(int i = 0 ; i<d.length ; i++) list.add(d[i]);
        
        Collections.sort(list);
        
        
        int total = 0;
        
        for(answer = 0 ; answer < d.length ; answer++ ) {
        	total += list.get(answer);
        	if(total > budget) break;
        }
           
        return answer;
    }
}


