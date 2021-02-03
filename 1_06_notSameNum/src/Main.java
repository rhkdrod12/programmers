import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
//		int[] arr = {1,1,3,3,0,1,1};
		int[] arr = {4,4,4,3,3};
		
		System.out.println(Arrays.toString(new Solution().solution(arr)));
		
	}

}

class Solution {
    public Integer[] solution(int []arr) {
        Integer[] answer = {};
        Deque<Integer> que = new LinkedList<Integer>();
        
        for(int i = 0 ; i <arr.length; i++) {
        	if(que.isEmpty() || que.peekLast() != arr[i]) que.add(arr[i]);
        }
        
        return que.toArray(new Integer[0]);
    }
}

