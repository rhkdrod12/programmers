import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class main {

	public static void main(String[] args) {
		
		// 프로그래머스 1-2 : 두 개 뽑아서 더하기 
		
		int[] numbers = {2,1,3,4,1};
		
		System.out.println(new Solution().solution(numbers));
		
	}

}

class Solution {
    public int[] solution(int[] numbers) {
        
    	HashSet<Integer> set = new HashSet<Integer>();
        
        for(int i = 0 ; i< numbers.length; i++) {
        	for(int j = i+1 ; j < numbers.length ; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        int[] answer = new int[set.size()];
        
        Iterator<Integer> it = set.iterator();
        
        int i = 0;
        while(it.hasNext()) {
        	answer[i++] = it.next();
        }
        
        Arrays.sort(answer);
        return answer;
    }
}