import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {10,2};
		
		System.out.println("°ª: " + Arrays.toString(new Solution().solution(arr)));
		
	}

}

class Solution {
    public int[] solution(int[] arr) {
        
    	int[] answer;
        
    	if(arr.length > 1) {
	        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	        list.remove(list.stream().min(Comparator.naturalOrder()).get());
        	answer = new int[list.size()];
            for(int i = 0 ; i<list.size() ; i++) 
            	answer[i] = list.get(i);
        }else {
        	answer = new int[]{-1};
        }
        
        return answer;
    }
}