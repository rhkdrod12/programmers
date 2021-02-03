import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {5,9,7,10};
		int divisor = 5;
		
		System.out.println(Arrays.toString(new Solution().solution(arr, divisor)));
		
	}

}

class Solution {
    public Integer[] solution(int[] arr, int divisor) {
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        for(int i = 0 ; i< arr.length; i++) {
        	if(arr[i]%divisor == 0) {
        		ans.add(arr[i]);
        	}
        }
        
        Collections.sort(ans);
        
        if(ans.size() == 0 ) ans.add(-1);
        
        return ans.toArray(new Integer[0]);
    }
}